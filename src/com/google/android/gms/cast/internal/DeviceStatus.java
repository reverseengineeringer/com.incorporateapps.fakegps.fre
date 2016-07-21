package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class DeviceStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  private final int mVersionCode;
  private double zzabs;
  private boolean zzabt;
  private int zzadG;
  private int zzadH;
  private ApplicationMetadata zzadR;
  
  public DeviceStatus()
  {
    this(3, NaN.0D, false, -1, null, -1);
  }
  
  DeviceStatus(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, ApplicationMetadata paramApplicationMetadata, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzabs = paramDouble;
    zzabt = paramBoolean;
    zzadG = paramInt2;
    zzadR = paramApplicationMetadata;
    zzadH = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof DeviceStatus)) {
        return false;
      }
      paramObject = (DeviceStatus)paramObject;
    } while ((zzabs == zzabs) && (zzabt == zzabt) && (zzadG == zzadG) && (zzf.zza(zzadR, zzadR)) && (zzadH == zzadH));
    return false;
  }
  
  public ApplicationMetadata getApplicationMetadata()
  {
    return zzadR;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Double.valueOf(zzabs), Boolean.valueOf(zzabt), Integer.valueOf(zzadG), zzadR, Integer.valueOf(zzadH) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public double zzok()
  {
    return zzabs;
  }
  
  public int zzol()
  {
    return zzadG;
  }
  
  public int zzom()
  {
    return zzadH;
  }
  
  public boolean zzot()
  {
    return zzabt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.DeviceStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */