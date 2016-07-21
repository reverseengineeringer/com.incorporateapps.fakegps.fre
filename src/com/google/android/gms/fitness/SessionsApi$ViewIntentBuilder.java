package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.Session;

public class SessionsApi$ViewIntentBuilder
{
  private final Context mContext;
  private String zzavW;
  private Session zzavX;
  private boolean zzavY = false;
  
  public SessionsApi$ViewIntentBuilder(Context paramContext)
  {
    mContext = paramContext;
  }
  
  private Intent zzl(Intent paramIntent)
  {
    if (zzavW == null) {}
    Intent localIntent;
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localIntent = new Intent(paramIntent).setPackage(zzavW);
      localResolveInfo = mContext.getPackageManager().resolveActivity(localIntent, 0);
    } while (localResolveInfo == null);
    paramIntent = activityInfo.name;
    localIntent.setComponent(new ComponentName(zzavW, paramIntent));
    return localIntent;
  }
  
  public Intent build()
  {
    if (zzavX != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Session must be set");
      Intent localIntent = new Intent("vnd.google.fitness.VIEW");
      localIntent.setType(Session.getMimeType(zzavX.getActivity()));
      zzc.zza(zzavX, localIntent, "vnd.google.fitness.session");
      if (!zzavY) {
        zzavW = zzavX.getAppPackageName();
      }
      return zzl(localIntent);
    }
  }
  
  public ViewIntentBuilder setPreferredApplication(String paramString)
  {
    zzavW = paramString;
    zzavY = true;
    return this;
  }
  
  public ViewIntentBuilder setSession(Session paramSession)
  {
    zzavX = paramSession;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */