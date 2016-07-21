package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import java.util.ArrayList;

public abstract class MultiDataBufferRef
  extends zzc
{
  protected final ArrayList zzaDN;
  
  protected MultiDataBufferRef(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    super((DataHolder)paramArrayList.get(paramInt1), paramInt2);
    zzaDN = paramArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.MultiDataBufferRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */