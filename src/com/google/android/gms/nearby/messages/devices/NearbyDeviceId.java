package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class NearbyDeviceId
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  public static final NearbyDeviceId zzbcl = new NearbyDeviceId();
  final int mVersionCode;
  private final int zzabB;
  final byte[] zzbbY;
  private final zzb zzbcm;
  private final zzd zzbcn;
  
  private NearbyDeviceId()
  {
    this(1, 1, null);
  }
  
  NearbyDeviceId(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    mVersionCode = paramInt1;
    zzabB = paramInt2;
    zzbbY = paramArrayOfByte;
    if (paramInt2 == 2) {}
    for (Object localObject1 = new zzb(paramArrayOfByte);; localObject1 = null)
    {
      zzbcm = ((zzb)localObject1);
      localObject1 = localObject2;
      if (paramInt2 == 3) {
        localObject1 = new zzd(paramArrayOfByte);
      }
      zzbcn = ((zzd)localObject1);
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof NearbyDeviceId)) {
        return false;
      }
      paramObject = (NearbyDeviceId)paramObject;
    } while ((zzw.equal(Integer.valueOf(zzabB), Integer.valueOf(zzabB))) && (zzw.equal(zzbbY, zzbbY)));
    return false;
  }
  
  public int getType()
  {
    return zzabB;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzabB), zzbbY });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NearbyDeviceId{");
    switch (zzabB)
    {
    }
    for (;;)
    {
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append("eddystoneUid=").append(zzbcm);
      continue;
      localStringBuilder.append("iBeaconId=").append(zzbcn);
      continue;
      localStringBuilder.append("UNKNOWN");
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.NearbyDeviceId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */