package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;

public class zza
{
  public boolean zza(Context paramContext, Intent paramIntent, zzp paramzzp)
  {
    try
    {
      zzin.v("Launching an intent: " + paramIntent.toURI());
      zzr.zzbC().zzb(paramContext, paramIntent);
      if (paramzzp != null) {
        paramzzp.zzaO();
      }
      return true;
    }
    catch (ActivityNotFoundException paramContext)
    {
      zzin.zzaK(paramContext.getMessage());
    }
    return false;
  }
  
  public boolean zza(Context paramContext, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, zzp paramzzp)
  {
    int i = 0;
    if (paramAdLauncherIntentInfoParcel == null)
    {
      zzin.zzaK("No intent data for launcher overlay.");
      return false;
    }
    if (intent != null) {
      return zza(paramContext, intent, paramzzp);
    }
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(url))
    {
      zzin.zzaK("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(mimeType)) {
      localIntent.setDataAndType(Uri.parse(url), mimeType);
    }
    String[] arrayOfString;
    for (;;)
    {
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(packageName)) {
        localIntent.setPackage(packageName);
      }
      if (TextUtils.isEmpty(zzDK)) {
        break label196;
      }
      arrayOfString = zzDK.split("/", 2);
      if (arrayOfString.length >= 2) {
        break;
      }
      zzin.zzaK("Could not parse component name from open GMSG: " + zzDK);
      return false;
      localIntent.setData(Uri.parse(url));
    }
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    label196:
    paramAdLauncherIntentInfoParcel = zzDL;
    if (!TextUtils.isEmpty(paramAdLauncherIntentInfoParcel)) {}
    try
    {
      int j = Integer.parseInt(paramAdLauncherIntentInfoParcel);
      i = j;
    }
    catch (NumberFormatException paramAdLauncherIntentInfoParcel)
    {
      for (;;)
      {
        zzin.zzaK("Could not parse intent flags.");
      }
    }
    localIntent.addFlags(i);
    return zza(paramContext, localIntent, paramzzp);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */