package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSubscriptionsResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBM;
  
  ListSubscriptionsResult(int paramInt, List paramList, Status paramStatus)
  {
    mVersionCode = paramInt;
    zzaBM = paramList;
    zzUX = paramStatus;
  }
  
  public ListSubscriptionsResult(List paramList, Status paramStatus)
  {
    mVersionCode = 3;
    zzaBM = Collections.unmodifiableList(paramList);
    zzUX = ((Status)zzx.zzb(paramStatus, "status"));
  }
  
  public static ListSubscriptionsResult zzT(Status paramStatus)
  {
    return new ListSubscriptionsResult(Collections.emptyList(), paramStatus);
  }
  
  private boolean zzb(ListSubscriptionsResult paramListSubscriptionsResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzaBM, zzaBM));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof ListSubscriptionsResult)) && (zzb((ListSubscriptionsResult)paramObject)));
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public List getSubscriptions()
  {
    return zzaBM;
  }
  
  public List getSubscriptions(DataType paramDataType)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzaBM.iterator();
    while (localIterator.hasNext())
    {
      Subscription localSubscription = (Subscription)localIterator.next();
      if (paramDataType.equals(localSubscription.zzuy())) {
        localArrayList.add(localSubscription);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzUX, zzaBM });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("subscriptions", zzaBM).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.ListSubscriptionsResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */