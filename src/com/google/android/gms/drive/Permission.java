package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class Permission
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  final int mVersionCode;
  private String zzapk;
  private int zzapl;
  private String zzapm;
  private String zzapn;
  private int zzapo;
  private boolean zzapp;
  
  Permission(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, int paramInt3, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzapk = paramString1;
    zzapl = paramInt2;
    zzapm = paramString2;
    zzapn = paramString3;
    zzapo = paramInt3;
    zzapp = paramBoolean;
  }
  
  public static boolean zzcA(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean zzcz(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == this);
      paramObject = (Permission)paramObject;
      if ((!zzw.equal(zzapk, zzapk)) || (zzapl != zzapl) || (zzapo != zzapo)) {
        break;
      }
      bool1 = bool2;
    } while (zzapp == zzapp);
    return false;
  }
  
  public int getRole()
  {
    if (!zzcA(zzapo)) {
      return -1;
    }
    return zzapo;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzapk, Integer.valueOf(zzapl), Integer.valueOf(zzapo), Boolean.valueOf(zzapp) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public String zzsO()
  {
    if (!zzcz(zzapl)) {
      return null;
    }
    return zzapk;
  }
  
  public int zzsP()
  {
    if (!zzcz(zzapl)) {
      return -1;
    }
    return zzapl;
  }
  
  public String zzsQ()
  {
    return zzapm;
  }
  
  public String zzsR()
  {
    return zzapn;
  }
  
  public boolean zzsS()
  {
    return zzapp;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.Permission
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */