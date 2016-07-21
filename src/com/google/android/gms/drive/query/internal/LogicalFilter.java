package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogicalFilter
  extends AbstractFilter
{
  public static final Parcelable.Creator CREATOR = new zzk();
  final int mVersionCode;
  private List zzaua;
  final Operator zzaug;
  final List zzauv;
  
  LogicalFilter(int paramInt, Operator paramOperator, List paramList)
  {
    mVersionCode = paramInt;
    zzaug = paramOperator;
    zzauv = paramList;
  }
  
  public LogicalFilter(Operator paramOperator, Filter paramFilter, Filter... paramVarArgs)
  {
    mVersionCode = 1;
    zzaug = paramOperator;
    zzauv = new ArrayList(paramVarArgs.length + 1);
    zzauv.add(new FilterHolder(paramFilter));
    zzaua = new ArrayList(paramVarArgs.length + 1);
    zzaua.add(paramFilter);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      paramOperator = paramVarArgs[i];
      zzauv.add(new FilterHolder(paramOperator));
      zzaua.add(paramOperator);
      i += 1;
    }
  }
  
  public LogicalFilter(Operator paramOperator, Iterable paramIterable)
  {
    mVersionCode = 1;
    zzaug = paramOperator;
    zzaua = new ArrayList();
    zzauv = new ArrayList();
    paramOperator = paramIterable.iterator();
    while (paramOperator.hasNext())
    {
      paramIterable = (Filter)paramOperator.next();
      zzaua.add(paramIterable);
      zzauv.add(new FilterHolder(paramIterable));
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzauv.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((FilterHolder)localIterator.next()).getFilter().zza(paramzzf));
    }
    return paramzzf.zzb(zzaug, localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.LogicalFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */