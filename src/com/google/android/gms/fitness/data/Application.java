package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public final class Application
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  public static final Application zzawa = new Application("com.google.android.gms", String.valueOf(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE), null);
  private final int mVersionCode;
  private final String zzTJ;
  private final String zzadc;
  private final String zzawb;
  
  Application(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    mVersionCode = paramInt;
    zzTJ = ((String)zzx.zzz(paramString1));
    zzadc = "";
    zzawb = paramString3;
  }
  
  public Application(String paramString1, String paramString2, String paramString3)
  {
    this(1, paramString1, "", paramString3);
  }
  
  private boolean zza(Application paramApplication)
  {
    return (zzTJ.equals(zzTJ)) && (zzw.equal(zzadc, zzadc)) && (zzw.equal(zzawb, zzawb));
  }
  
  public static Application zzdn(String paramString)
  {
    return zzg(paramString, null, null);
  }
  
  public static Application zzg(String paramString1, String paramString2, String paramString3)
  {
    if ("com.google.android.gms".equals(paramString1)) {
      return zzawa;
    }
    return new Application(paramString1, paramString2, paramString3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof Application)) && (zza((Application)paramObject)));
  }
  
  public final String getPackageName()
  {
    return zzTJ;
  }
  
  public final String getVersion()
  {
    return zzadc;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzTJ, zzadc, zzawb });
  }
  
  public final String toString()
  {
    return String.format("Application{%s:%s:%s}", new Object[] { zzTJ, zzadc, zzawb });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final String zzua()
  {
    return zzawb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Application
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */