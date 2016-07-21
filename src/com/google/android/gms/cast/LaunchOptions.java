package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

public class LaunchOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  private final int mVersionCode;
  private boolean zzaaK;
  private String zzaaL;
  
  public LaunchOptions()
  {
    this(1, false, zzf.zzb(Locale.getDefault()));
  }
  
  LaunchOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    mVersionCode = paramInt;
    zzaaK = paramBoolean;
    zzaaL = paramString;
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
      if (!(paramObject instanceof LaunchOptions)) {
        return false;
      }
      paramObject = (LaunchOptions)paramObject;
    } while ((zzaaK == zzaaK) && (zzf.zza(zzaaL, zzaaL)));
    return false;
  }
  
  public String getLanguage()
  {
    return zzaaL;
  }
  
  public boolean getRelaunchIfRunning()
  {
    return zzaaK;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Boolean.valueOf(zzaaK), zzaaL });
  }
  
  public void setLanguage(String paramString)
  {
    zzaaL = paramString;
  }
  
  public void setRelaunchIfRunning(boolean paramBoolean)
  {
    zzaaK = paramBoolean;
  }
  
  public String toString()
  {
    return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] { Boolean.valueOf(zzaaK), zzaaL });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */