package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class zzan
  extends zzd
{
  protected boolean zzPi;
  protected int zzRB;
  protected String zzSE;
  protected String zzSF;
  protected int zzSH;
  protected boolean zzTv;
  protected boolean zzTw;
  protected boolean zzTx;
  
  public zzan(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  private static int zzby(String paramString)
  {
    paramString = paramString.toLowerCase();
    if ("verbose".equals(paramString)) {
      return 0;
    }
    if ("info".equals(paramString)) {
      return 1;
    }
    if ("warning".equals(paramString)) {
      return 2;
    }
    if ("error".equals(paramString)) {
      return 3;
    }
    return -1;
  }
  
  public int getLogLevel()
  {
    zzjv();
    return zzRB;
  }
  
  void zza(zzaa paramzzaa)
  {
    zzbd("Loading global XML config values");
    String str;
    if (paramzzaa.zzlf())
    {
      str = paramzzaa.zzlg();
      zzSE = str;
      zzb("XML config - app name", str);
    }
    if (paramzzaa.zzlh())
    {
      str = paramzzaa.zzli();
      zzSF = str;
      zzb("XML config - app version", str);
    }
    int i;
    if (paramzzaa.zzlj())
    {
      i = zzby(paramzzaa.zzlk());
      if (i >= 0)
      {
        zzRB = i;
        zza("XML config - log level", Integer.valueOf(i));
      }
    }
    if (paramzzaa.zzll())
    {
      i = paramzzaa.zzlm();
      zzSH = i;
      zzTw = true;
      zzb("XML config - dispatch period (sec)", Integer.valueOf(i));
    }
    if (paramzzaa.zzln())
    {
      boolean bool = paramzzaa.zzlo();
      zzPi = bool;
      zzTx = true;
      zzb("XML config - dry run", Boolean.valueOf(bool));
    }
  }
  
  protected void zziJ()
  {
    zzmd();
  }
  
  public String zzlg()
  {
    zzjv();
    return zzSE;
  }
  
  public String zzli()
  {
    zzjv();
    return zzSF;
  }
  
  public boolean zzlj()
  {
    zzjv();
    return zzTv;
  }
  
  public boolean zzll()
  {
    zzjv();
    return zzTw;
  }
  
  public boolean zzln()
  {
    zzjv();
    return zzTx;
  }
  
  public boolean zzlo()
  {
    zzjv();
    return zzPi;
  }
  
  public int zzmc()
  {
    zzjv();
    return zzSH;
  }
  
  protected void zzmd()
  {
    Object localObject1 = getContext();
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 129);
      if (localObject1 == null)
      {
        zzbg("Couldn't get ApplicationInfo to load global config");
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject2;
      do
      {
        int i;
        do
        {
          do
          {
            for (;;)
            {
              zzd("PackageManager doesn't know about the app package", localNameNotFoundException);
              localObject2 = null;
            }
            localObject2 = metaData;
          } while (localObject2 == null);
          i = ((Bundle)localObject2).getInt("com.google.android.gms.analytics.globalConfigResource");
        } while (i <= 0);
        localObject2 = (zzaa)new zzz(zzji()).zzah(i);
      } while (localObject2 == null);
      zza((zzaa)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */