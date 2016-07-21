package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.UsageInfo.zza;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.appindexing.AppIndexApi.ActionResult;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.List;

public final class zzkk
  implements zzk, AppIndexApi
{
  public static Intent zza(String paramString, Uri paramUri)
  {
    zzb(paramString, paramUri);
    if (zzk(paramUri)) {
      return new Intent("android.intent.action.VIEW", paramUri);
    }
    if (zzl(paramUri)) {
      return new Intent("android.intent.action.VIEW", zzj(paramUri));
    }
    throw new RuntimeException("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: " + paramUri);
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, Action paramAction, int paramInt)
  {
    String str = paramGoogleApiClient.getContext().getPackageName();
    return zza(paramGoogleApiClient, new UsageInfo[] { zzkj.zza(paramAction, System.currentTimeMillis(), str, paramInt) });
  }
  
  private static void zzb(String paramString, Uri paramUri)
  {
    if (zzk(paramUri))
    {
      if (paramUri.getHost().isEmpty()) {
        throw new IllegalArgumentException("AppIndex: The web URL must have a host (follow the format http(s)://<host>/[path]). Provided URI: " + paramUri);
      }
    }
    else if (zzl(paramUri))
    {
      if ((paramString != null) && (!paramString.equals(paramUri.getHost()))) {
        throw new IllegalArgumentException("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/[host_path]. Provided URI: " + paramUri);
      }
      paramString = paramUri.getPathSegments();
      if ((paramString.isEmpty()) || (((String)paramString.get(0)).isEmpty())) {
        throw new IllegalArgumentException("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + paramUri);
      }
    }
    else
    {
      throw new IllegalArgumentException("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/[host_path]'. Provided URI: " + paramUri);
    }
  }
  
  private static Uri zzj(Uri paramUri)
  {
    List localList = paramUri.getPathSegments();
    String str = (String)localList.get(0);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme(str);
    if (localList.size() > 1)
    {
      localBuilder.authority((String)localList.get(1));
      int i = 2;
      while (i < localList.size())
      {
        localBuilder.appendPath((String)localList.get(i));
        i += 1;
      }
    }
    localBuilder.encodedQuery(paramUri.getEncodedQuery());
    localBuilder.encodedFragment(paramUri.getEncodedFragment());
    return localBuilder.build();
  }
  
  private static boolean zzk(Uri paramUri)
  {
    paramUri = paramUri.getScheme();
    return ("http".equals(paramUri)) || ("https".equals(paramUri));
  }
  
  private static boolean zzl(Uri paramUri)
  {
    return "android-app".equals(paramUri.getScheme());
  }
  
  public static void zzt(List paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        zzb(null, nextappIndexingUrl);
      }
    }
  }
  
  public final AppIndexApi.ActionResult action(GoogleApiClient paramGoogleApiClient, Action paramAction)
  {
    return new zzkk.zza(this, zza(paramGoogleApiClient, paramAction, 1), paramAction);
  }
  
  public final PendingResult end(GoogleApiClient paramGoogleApiClient, Action paramAction)
  {
    return zza(paramGoogleApiClient, paramAction, 2);
  }
  
  public final PendingResult start(GoogleApiClient paramGoogleApiClient, Action paramAction)
  {
    return zza(paramGoogleApiClient, paramAction, 1);
  }
  
  public final PendingResult view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent, String paramString, Uri paramUri, List paramList)
  {
    paramActivity = paramGoogleApiClient.getContext().getPackageName();
    zzt(paramList);
    return zza(paramGoogleApiClient, new UsageInfo[] { new UsageInfo(paramActivity, paramIntent, paramString, paramUri, null, paramList, 1) });
  }
  
  public final PendingResult view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri1, String paramString, Uri paramUri2, List paramList)
  {
    String str = paramGoogleApiClient.getContext().getPackageName();
    zzb(str, paramUri1);
    return view(paramGoogleApiClient, paramActivity, zza(str, paramUri1), paramString, paramUri2, paramList);
  }
  
  public final PendingResult viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent)
  {
    paramActivity = paramGoogleApiClient.getContext().getPackageName();
    return zza(paramGoogleApiClient, new UsageInfo[] { new UsageInfo.zza().zza(UsageInfo.zza(paramActivity, paramIntent)).zzw(System.currentTimeMillis()).zzar(0).zzas(2).zzmi() });
  }
  
  public final PendingResult viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri)
  {
    return viewEnd(paramGoogleApiClient, paramActivity, zza(paramGoogleApiClient.getContext().getPackageName(), paramUri));
  }
  
  public final PendingResult zza(GoogleApiClient paramGoogleApiClient, UsageInfo... paramVarArgs)
  {
    return paramGoogleApiClient.zza(new zzkk.1(this, paramGoogleApiClient, paramGoogleApiClient.getContext().getPackageName(), paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */