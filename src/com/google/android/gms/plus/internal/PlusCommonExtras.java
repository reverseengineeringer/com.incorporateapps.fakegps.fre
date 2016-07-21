package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class PlusCommonExtras
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  private final int mVersionCode;
  private String zzbeo;
  private String zzbep;
  
  public PlusCommonExtras()
  {
    mVersionCode = 1;
    zzbeo = "";
    zzbep = "";
  }
  
  PlusCommonExtras(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzbeo = paramString1;
    zzbep = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlusCommonExtras)) {}
    do
    {
      return false;
      paramObject = (PlusCommonExtras)paramObject;
    } while ((mVersionCode != mVersionCode) || (!zzw.equal(zzbeo, zzbeo)) || (!zzw.equal(zzbep, zzbep)));
    return true;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(mVersionCode), zzbeo, zzbep });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("versionCode", Integer.valueOf(mVersionCode)).zzg("Gpsrc", zzbeo).zzg("ClientCallingPackage", zzbep).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public String zzFb()
  {
    return zzbeo;
  }
  
  public String zzFc()
  {
    return zzbep;
  }
  
  public void zzJ(Bundle paramBundle)
  {
    paramBundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", zzc.zza(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.PlusCommonExtras
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */