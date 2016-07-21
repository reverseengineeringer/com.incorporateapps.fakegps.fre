package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BleDevicesResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBE;
  
  BleDevicesResult(int paramInt, List paramList, Status paramStatus)
  {
    mVersionCode = paramInt;
    zzaBE = Collections.unmodifiableList(paramList);
    zzUX = paramStatus;
  }
  
  public BleDevicesResult(List paramList, Status paramStatus)
  {
    mVersionCode = 3;
    zzaBE = Collections.unmodifiableList(paramList);
    zzUX = paramStatus;
  }
  
  public static BleDevicesResult zzQ(Status paramStatus)
  {
    return new BleDevicesResult(Collections.emptyList(), paramStatus);
  }
  
  private boolean zzb(BleDevicesResult paramBleDevicesResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzaBE, zzaBE));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof BleDevicesResult)) && (zzb((BleDevicesResult)paramObject)));
  }
  
  public List getClaimedBleDevices()
  {
    return zzaBE;
  }
  
  public List getClaimedBleDevices(DataType paramDataType)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzaBE.iterator();
    while (localIterator.hasNext())
    {
      BleDevice localBleDevice = (BleDevice)localIterator.next();
      if (localBleDevice.getDataTypes().contains(paramDataType)) {
        localArrayList.add(localBleDevice);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzUX, zzaBE });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("bleDevices", zzaBE).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.BleDevicesResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */