package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

class zzcx
  implements zzac
{
  private final Context mContext;
  private final zzcx.zzb zzblh;
  private final zzcx.zza zzbli;
  private final String zzzN;
  
  zzcx(Context paramContext, zzcx.zza paramzza)
  {
    this(new zzcx.1(), paramContext, paramzza);
  }
  
  zzcx(zzcx.zzb paramzzb, Context paramContext, zzcx.zza paramzza)
  {
    zzblh = paramzzb;
    mContext = paramContext.getApplicationContext();
    zzbli = paramzza;
    zzzN = zza("GoogleTagManager", "4.00", Build.VERSION.RELEASE, zzc(Locale.getDefault()), Build.MODEL, Build.ID);
  }
  
  static String zzc(Locale paramLocale)
  {
    if (paramLocale == null) {}
    while ((paramLocale.getLanguage() == null) || (paramLocale.getLanguage().length() == 0)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLocale.getLanguage().toLowerCase());
    if ((paramLocale.getCountry() != null) && (paramLocale.getCountry().length() != 0)) {
      localStringBuilder.append("-").append(paramLocale.getCountry().toLowerCase());
    }
    return localStringBuilder.toString();
  }
  
  public void zzE(List paramList)
  {
    int n = Math.min(paramList.size(), 40);
    int i = 1;
    int m = 0;
    if (m < n)
    {
      zzaq localzzaq = (zzaq)paramList.get(m);
      Object localObject1 = zzd(localzzaq);
      if (localObject1 == null)
      {
        zzbg.zzaK("No destination: discarding hit.");
        zzbli.zzb(localzzaq);
      }
      for (;;)
      {
        m += 1;
        break;
        int k = i;
        try
        {
          localObject1 = zzblh.zzd((URL)localObject1);
          int j = i;
          if (i != 0) {}
          try
          {
            zzbl.zzbb(mContext);
            j = 0;
            i = j;
            ((HttpURLConnection)localObject1).setRequestProperty("User-Agent", zzzN);
            i = j;
            k = ((HttpURLConnection)localObject1).getResponseCode();
            if (k != 200)
            {
              i = j;
              zzbg.zzaK("Bad response: " + k);
              i = j;
              zzbli.zzc(localzzaq);
            }
            for (;;)
            {
              k = j;
              ((HttpURLConnection)localObject1).disconnect();
              i = j;
              break;
              i = j;
              zzbli.zza(localzzaq);
            }
            zzbg.zzaK("Exception sending hit: " + localIOException1.getClass().getSimpleName());
          }
          finally
          {
            try
            {
              ((HttpURLConnection)localObject1).disconnect();
              throw ((Throwable)localObject2);
            }
            catch (IOException localIOException1)
            {
              k = i;
            }
          }
        }
        catch (IOException localIOException2)
        {
          for (;;) {}
        }
        zzbg.zzaK(localIOException1.getMessage());
        zzbli.zzc(localzzaq);
        i = k;
      }
    }
  }
  
  public boolean zzGw()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      zzbg.v("...no network connectivity");
      return false;
    }
    return true;
  }
  
  String zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  URL zzd(zzaq paramzzaq)
  {
    paramzzaq = paramzzaq.zzGF();
    try
    {
      paramzzaq = new URL(paramzzaq);
      return paramzzaq;
    }
    catch (MalformedURLException paramzzaq)
    {
      zzbg.e("Error trying to parse the GTM url.");
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */