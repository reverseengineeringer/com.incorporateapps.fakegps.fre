package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

public final class FileUploadPreferencesImpl
  implements SafeParcelable, FileUploadPreferences
{
  public static final Parcelable.Creator CREATOR = new zzag();
  final int mVersionCode;
  int zzarG;
  int zzarH;
  boolean zzarI;
  
  FileUploadPreferencesImpl(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzarG = paramInt2;
    zzarH = paramInt3;
    zzarI = paramBoolean;
  }
  
  public static boolean zzdj(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean zzdk(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getBatteryUsagePreference()
  {
    if (!zzdk(zzarH)) {
      return 0;
    }
    return zzarH;
  }
  
  public final int getNetworkTypePreference()
  {
    if (!zzdj(zzarG)) {
      return 0;
    }
    return zzarG;
  }
  
  public final boolean isRoamingAllowed()
  {
    return zzarI;
  }
  
  public final void setBatteryUsagePreference(int paramInt)
  {
    if (!zzdk(paramInt)) {
      throw new IllegalArgumentException("Invalid battery usage preference value.");
    }
    zzarH = paramInt;
  }
  
  public final void setNetworkTypePreference(int paramInt)
  {
    if (!zzdj(paramInt)) {
      throw new IllegalArgumentException("Invalid data connection preference value.");
    }
    zzarG = paramInt;
  }
  
  public final void setRoamingAllowed(boolean paramBoolean)
  {
    zzarI = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzag.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.FileUploadPreferencesImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */