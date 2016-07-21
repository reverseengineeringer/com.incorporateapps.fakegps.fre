package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.zzz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter
  extends BaseAdapter
{
  private final Context mContext;
  private final LayoutInflater mInflater;
  private final int zzavs;
  private int zzavt;
  private final int zzavu;
  private final List zzavv;
  private boolean zzavw = true;
  
  public DataBufferAdapter(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 0, new ArrayList());
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2)
  {
    this(paramContext, paramInt1, paramInt2, new ArrayList());
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, List paramList)
  {
    mContext = paramContext;
    zzavt = paramInt1;
    zzavs = paramInt1;
    zzavu = paramInt2;
    zzavv = paramList;
    mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, DataBuffer... paramVarArgs)
  {
    this(paramContext, paramInt1, paramInt2, Arrays.asList(paramVarArgs));
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt, List paramList)
  {
    this(paramContext, paramInt, 0, paramList);
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt, DataBuffer... paramVarArgs)
  {
    this(paramContext, paramInt, 0, Arrays.asList(paramVarArgs));
  }
  
  private View zza(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    if (paramView == null) {
      paramView = mInflater.inflate(paramInt2, paramViewGroup, false);
    }
    for (;;)
    {
      try
      {
        Object localObject;
        if (zzavu == 0)
        {
          paramViewGroup = (TextView)paramView;
          localObject = getItem(paramInt1);
          if ((localObject instanceof CharSequence))
          {
            paramViewGroup.setText((CharSequence)localObject);
            return paramView;
          }
        }
        else
        {
          paramViewGroup = (TextView)paramView.findViewById(zzavu);
          continue;
        }
        paramViewGroup.setText(localObject.toString());
      }
      catch (ClassCastException paramView)
      {
        zzz.zza("DataBufferAdapter", paramView, "You must supply a resource ID for a TextView");
        throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", paramView);
      }
      return paramView;
    }
  }
  
  public void append(DataBuffer paramDataBuffer)
  {
    zzavv.add(paramDataBuffer);
    if (zzavw) {
      notifyDataSetChanged();
    }
  }
  
  public void clear()
  {
    Iterator localIterator = zzavv.iterator();
    while (localIterator.hasNext()) {
      ((DataBuffer)localIterator.next()).release();
    }
    zzavv.clear();
    if (zzavw) {
      notifyDataSetChanged();
    }
  }
  
  public Context getContext()
  {
    return mContext;
  }
  
  public int getCount()
  {
    Iterator localIterator = zzavv.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((DataBuffer)localIterator.next()).getCount() + i) {}
    return i;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return zza(paramInt, paramView, paramViewGroup, zzavt);
  }
  
  public Object getItem(int paramInt)
  {
    Object localObject = zzavv.iterator();
    int i = paramInt;
    while (((Iterator)localObject).hasNext())
    {
      DataBuffer localDataBuffer = (DataBuffer)((Iterator)localObject).next();
      int j = localDataBuffer.getCount();
      if (j <= i) {
        i -= j;
      } else {
        try
        {
          localObject = localDataBuffer.get(i);
          return localObject;
        }
        catch (CursorIndexOutOfBoundsException localCursorIndexOutOfBoundsException)
        {
          throw new CursorIndexOutOfBoundsException(paramInt, getCount());
        }
      }
    }
    throw new CursorIndexOutOfBoundsException(paramInt, getCount());
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return zza(paramInt, paramView, paramViewGroup, zzavs);
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    zzavw = true;
  }
  
  public void setDropDownViewResource(int paramInt)
  {
    zzavt = paramInt;
  }
  
  public void setNotifyOnChange(boolean paramBoolean)
  {
    zzavw = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.widget.DataBufferAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */