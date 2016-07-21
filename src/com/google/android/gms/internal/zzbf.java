package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class zzbf
  extends Thread
{
  private boolean mStarted = false;
  private boolean zzam = false;
  private final Object zzpV;
  private final int zzsK;
  private final int zzsM;
  private boolean zzsY = false;
  private final zzbe zzsZ;
  private final zzbd zzta;
  private final zzha zztb;
  private final int zztc;
  private final int zztd;
  private final int zzte;
  
  public zzbf(zzbe paramzzbe, zzbd paramzzbd, zzha paramzzha)
  {
    zzsZ = paramzzbe;
    zzta = paramzzbd;
    zztb = paramzzha;
    zzpV = new Object();
    zzsK = ((Integer)zzbt.zzwk.get()).intValue();
    zztd = ((Integer)zzbt.zzwl.get()).intValue();
    zzsM = ((Integer)zzbt.zzwm.get()).intValue();
    zzte = ((Integer)zzbt.zzwn.get()).intValue();
    zztc = ((Integer)zzbt.zzwo.get()).intValue();
    setName("ContentFetchTask");
  }
  
  public void run()
  {
    while (!zzam) {
      try
      {
        if (zzcH())
        {
          Activity localActivity = zzsZ.getActivity();
          if (localActivity == null) {
            zzin.zzaI("ContentFetchThread: no activity");
          }
        }
      }
      catch (Throwable localThrowable)
      {
        zzin.zzb("Error in ContentFetchTask", localThrowable);
        zztb.zza(localThrowable, true);
        synchronized (zzpV)
        {
          for (;;)
          {
            boolean bool = zzsY;
            if (!bool) {
              break;
            }
            try
            {
              zzin.zzaI("ContentFetchTask: waiting");
              zzpV.wait();
            }
            catch (InterruptedException localInterruptedException) {}
          }
          zza((Activity)???);
          for (;;)
          {
            Thread.sleep(zztc * 1000);
            break;
            zzin.zzaI("ContentFetchTask: sleeping");
            zzcJ();
          }
        }
      }
    }
  }
  
  public void wakeup()
  {
    synchronized (zzpV)
    {
      zzsY = false;
      zzpV.notifyAll();
      zzin.zzaI("ContentFetchThread: wakeup");
      return;
    }
  }
  
  zzbf.zza zza(View paramView, zzbc paramzzbc)
  {
    int j = 0;
    if (paramView == null) {
      return new zzbf.zza(this, 0, 0);
    }
    boolean bool = paramView.getGlobalVisibleRect(new Rect());
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      paramView = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty(paramView))
      {
        paramzzbc.zzd(paramView.toString(), bool);
        return new zzbf.zza(this, 1, 0);
      }
      return new zzbf.zza(this, 0, 0);
    }
    if (((paramView instanceof WebView)) && (!(paramView instanceof zzjp)))
    {
      paramzzbc.zzcC();
      if (zza((WebView)paramView, paramzzbc, bool)) {
        return new zzbf.zza(this, 0, 1);
      }
      return new zzbf.zza(this, 0, 0);
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int k = 0;
      int i = 0;
      while (i < paramView.getChildCount())
      {
        zzbf.zza localzza = zza(paramView.getChildAt(i), paramzzbc);
        k += zztm;
        j += zztn;
        i += 1;
      }
      return new zzbf.zza(this, k, j);
    }
    return new zzbf.zza(this, 0, 0);
  }
  
  void zza(Activity paramActivity)
  {
    if (paramActivity == null) {}
    Object localObject1;
    do
    {
      return;
      Object localObject2 = null;
      localObject1 = localObject2;
      if (paramActivity.getWindow() != null)
      {
        localObject1 = localObject2;
        if (paramActivity.getWindow().getDecorView() != null) {
          localObject1 = paramActivity.getWindow().getDecorView().findViewById(16908290);
        }
      }
    } while (localObject1 == null);
    zze((View)localObject1);
  }
  
  void zza(zzbc paramzzbc, WebView paramWebView, String paramString, boolean paramBoolean)
  {
    paramzzbc.zzcB();
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = new JSONObject(paramString).optString("text");
        if (TextUtils.isEmpty(paramWebView.getTitle())) {
          break label85;
        }
        paramzzbc.zzc(paramWebView.getTitle() + "\n" + paramString, paramBoolean);
      }
      while (paramzzbc.zzcx())
      {
        zzta.zzb(paramzzbc);
        return;
        label85:
        paramzzbc.zzc(paramString, paramBoolean);
      }
      return;
    }
    catch (JSONException paramzzbc)
    {
      zzin.zzaI("Json string may be malformed.");
      return;
    }
    catch (Throwable paramzzbc)
    {
      zzin.zza("Failed to get webview content.", paramzzbc);
      zztb.zza(paramzzbc, true);
    }
  }
  
  boolean zza(ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo)
  {
    return importance == 100;
  }
  
  boolean zza(WebView paramWebView, zzbc paramzzbc, boolean paramBoolean)
  {
    if (!zzne.zzsk()) {
      return false;
    }
    paramzzbc.zzcC();
    paramWebView.post(new zzbf.2(this, paramzzbc, paramWebView, paramBoolean));
    return true;
  }
  
  public void zzcG()
  {
    synchronized (zzpV)
    {
      if (mStarted)
      {
        zzin.zzaI("Content hash thread already started, quiting...");
        return;
      }
      mStarted = true;
      start();
      return;
    }
  }
  
  boolean zzcH()
  {
    try
    {
      Context localContext = zzsZ.getContext();
      if (localContext == null) {
        return false;
      }
      Object localObject = (ActivityManager)localContext.getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)localContext.getSystemService("keyguard");
      if ((localObject != null) && (localKeyguardManager != null))
      {
        localObject = ((ActivityManager)localObject).getRunningAppProcesses();
        if (localObject == null) {
          return false;
        }
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
          if (Process.myPid() == pid) {
            if ((zza(localRunningAppProcessInfo)) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
            {
              boolean bool = zzs(localContext);
              if (bool) {
                return true;
              }
            }
          }
        }
        return false;
      }
    }
    catch (Throwable localThrowable)
    {
      return false;
    }
    return false;
  }
  
  public zzbc zzcI()
  {
    return zzta.zzcF();
  }
  
  public void zzcJ()
  {
    synchronized (zzpV)
    {
      zzsY = true;
      zzin.zzaI("ContentFetchThread: paused, mPause = " + zzsY);
      return;
    }
  }
  
  public boolean zzcK()
  {
    return zzsY;
  }
  
  boolean zze(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    paramView.post(new zzbf.1(this, paramView));
    return true;
  }
  
  void zzf(View paramView)
  {
    try
    {
      zzbc localzzbc = new zzbc(zzsK, zztd, zzsM, zzte);
      paramView = zza(paramView, localzzbc);
      localzzbc.zzcD();
      if ((zztm == 0) && (zztn == 0)) {
        return;
      }
      if (((zztn != 0) || (localzzbc.zzcE() != 0)) && ((zztn != 0) || (!zzta.zza(localzzbc))))
      {
        zzta.zzc(localzzbc);
        return;
      }
    }
    catch (Exception paramView)
    {
      zzin.zzb("Exception in fetchContentOnUIThread", paramView);
      zztb.zza(paramView, true);
    }
  }
  
  boolean zzs(Context paramContext)
  {
    paramContext = (PowerManager)paramContext.getSystemService("power");
    if (paramContext == null) {
      return false;
    }
    return paramContext.isScreenOn();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */