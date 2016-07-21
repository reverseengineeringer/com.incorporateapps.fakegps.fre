package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class Device
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final String description;
  private final String name;
  final int versionCode;
  private final String zzbaQ;
  private final byte zzbaR;
  
  Device(int paramInt, String paramString1, String paramString2, String paramString3, byte paramByte)
  {
    versionCode = paramInt;
    name = zzx.zzcM(paramString1);
    description = ((String)zzx.zzz(paramString2));
    zzbaQ = ((String)zzx.zzz(paramString3));
    if (paramByte <= 4) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Unknown device type");
      zzbaR = paramByte;
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDescription()
  {
    return description;
  }
  
  public String getDeviceId()
  {
    return zzbaQ;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String toString()
  {
    return name + ": " + description + "[" + zzbaR + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public byte zzEb()
  {
    return zzbaR;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.Device
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */