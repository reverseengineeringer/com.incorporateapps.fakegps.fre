package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class AdLauncherIntentInfoParcel
  implements SafeParcelable
{
  public static final zzb CREATOR = new zzb();
  public final Intent intent;
  public final String intentAction;
  public final String mimeType;
  public final String packageName;
  public final String url;
  public final int versionCode;
  public final String zzDK;
  public final String zzDL;
  public final String zzDM;
  
  public AdLauncherIntentInfoParcel(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent)
  {
    versionCode = paramInt;
    intentAction = paramString1;
    url = paramString2;
    mimeType = paramString3;
    packageName = paramString4;
    zzDK = paramString5;
    zzDL = paramString6;
    zzDM = paramString7;
    intent = paramIntent;
  }
  
  public AdLauncherIntentInfoParcel(Intent paramIntent)
  {
    this(2, null, null, null, null, null, null, null, paramIntent);
  }
  
  public AdLauncherIntentInfoParcel(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(2, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */