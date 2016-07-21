package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class zzjq
  extends WebViewClient
{
  private static final String[] zzNy = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] zzNz = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  private zzft zzDk;
  private zzjq.zza zzGm;
  private final HashMap zzNA = new HashMap();
  private zzg zzNB;
  private zzjq.zzb zzNC;
  private boolean zzND = false;
  private boolean zzNE;
  private zzp zzNF;
  private final zzfr zzNG;
  private boolean zzNH;
  private boolean zzNI;
  private boolean zzNJ;
  private int zzNK;
  protected zzjp zzpD;
  private final Object zzpV = new Object();
  private boolean zzsz;
  private zza zztz;
  private zzdb zzyW;
  private com.google.android.gms.ads.internal.zze zzzA;
  private zzfn zzzB;
  private zzdh zzzD;
  private zzdj zzzy;
  
  public zzjq(zzjp paramzzjp, boolean paramBoolean)
  {
    this(paramzzjp, paramBoolean, new zzfr(paramzzjp, paramzzjp.zzhQ(), new zzbl(paramzzjp.getContext())), null);
  }
  
  zzjq(zzjp paramzzjp, boolean paramBoolean, zzfr paramzzfr, zzfn paramzzfn)
  {
    zzpD = paramzzjp;
    zzsz = paramBoolean;
    zzNG = paramzzfr;
    zzzB = paramzzfn;
  }
  
  private void zza(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (!((Boolean)zzbt.zzwO.get()).booleanValue()) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("err", paramString1);
    localBundle.putString("code", paramString2);
    localBundle.putString("host", zzaN(paramString3));
    zzr.zzbC().zza(paramContext, zzpD.zzhX().afmaVersion, "gmob-apps", localBundle, true);
  }
  
  private String zzaN(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    paramString = Uri.parse(paramString);
    if (paramString.getHost() != null) {
      return paramString.getHost();
    }
    return "";
  }
  
  private static boolean zzg(Uri paramUri)
  {
    paramUri = paramUri.getScheme();
    return ("http".equalsIgnoreCase(paramUri)) || ("https".equalsIgnoreCase(paramUri));
  }
  
  private void zzij()
  {
    synchronized (zzpV)
    {
      zzNE = true;
      zzNK += 1;
      zzim();
      return;
    }
  }
  
  private void zzik()
  {
    zzNK -= 1;
    zzim();
  }
  
  private void zzil()
  {
    zzNJ = true;
    zzim();
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    zzin.v("Loading resource: " + paramString);
    paramWebView = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(paramWebView.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(paramWebView.getHost()))) {
      zzh(paramWebView);
    }
  }
  
  public final void onPageFinished(WebView arg1, String paramString)
  {
    synchronized (zzpV)
    {
      if (zzNH)
      {
        zzin.v("Blank page loaded, 1...");
        zzpD.zzhZ();
        return;
      }
      zzNI = true;
      zzim();
      return;
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if ((paramInt < 0) && (-paramInt - 1 < zzNy.length)) {}
    for (String str = zzNy[(-paramInt - 1)];; str = String.valueOf(paramInt))
    {
      zza(zzpD.getContext(), "http_err", str, paramString2);
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      return;
    }
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    int i;
    if (paramSslError != null)
    {
      i = paramSslError.getPrimaryError();
      if ((i < 0) || (i >= zzNz.length)) {
        break label65;
      }
    }
    label65:
    for (String str = zzNz[i];; str = String.valueOf(i))
    {
      zza(zzpD.getContext(), "ssl_err", str, zzr.zzbE().zza(paramSslError));
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      return;
    }
  }
  
  public final void reset()
  {
    synchronized (zzpV)
    {
      zzNA.clear();
      zztz = null;
      zzNB = null;
      zzGm = null;
      zzyW = null;
      zzND = false;
      zzsz = false;
      zzNE = false;
      zzzD = null;
      zzNF = null;
      zzNC = null;
      if (zzzB != null)
      {
        zzzB.zzp(true);
        zzzB = null;
      }
      return;
    }
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    zzin.v("AdWebView shouldOverrideUrlLoading: " + paramString);
    Uri localUri = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost()))) {
      zzh(localUri);
    }
    for (;;)
    {
      return true;
      if ((zzND) && (paramWebView == zzpD.getWebView()) && (zzg(localUri)))
      {
        if ((zztz != null) && (((Boolean)zzbt.zzww.get()).booleanValue()))
        {
          zztz.onAdClicked();
          zztz = null;
        }
        return super.shouldOverrideUrlLoading(paramWebView, paramString);
      }
      if (!zzpD.getWebView().willNotDraw())
      {
        try
        {
          zzan localzzan = zzpD.zzhW();
          paramWebView = localUri;
          if (localzzan != null)
          {
            paramWebView = localUri;
            if (localzzan.zzb(localUri)) {
              paramWebView = localzzan.zza(localUri, zzpD.getContext());
            }
          }
        }
        catch (zzao paramWebView)
        {
          for (;;)
          {
            zzin.zzaK("Unable to append parameter to URL: " + paramString);
            paramWebView = localUri;
          }
          zzzA.zzq(paramString);
        }
        if ((zzzA == null) || (zzzA.zzbh())) {
          zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", paramWebView.toString(), null, null, null, null, null));
        }
      }
      else
      {
        zzin.zzaK("AdWebView unable to handle URL: " + paramString);
      }
    }
  }
  
  public void zzG(boolean paramBoolean)
  {
    zzND = paramBoolean;
  }
  
  public void zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    zzNG.zzf(paramInt1, paramInt2);
    if (zzzB != null) {
      zzzB.zza(paramInt1, paramInt2, paramBoolean);
    }
  }
  
  public final void zza(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel)
  {
    zzg localzzg = null;
    boolean bool = zzpD.zzhY();
    zza localzza;
    if ((bool) && (!zzpD.zzaN().zzui))
    {
      localzza = null;
      if (!bool) {
        break label75;
      }
    }
    for (;;)
    {
      zza(new AdOverlayInfoParcel(paramAdLauncherIntentInfoParcel, localzza, localzzg, zzNF, zzpD.zzhX()));
      return;
      localzza = zztz;
      break;
      label75:
      localzzg = zzNB;
    }
  }
  
  public void zza(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    boolean bool2 = false;
    if (zzzB != null) {}
    for (boolean bool1 = zzzB.zzeN();; bool1 = false)
    {
      com.google.android.gms.ads.internal.overlay.zze localzze = zzr.zzbA();
      Context localContext = zzpD.getContext();
      if (!bool1) {
        bool2 = true;
      }
      localzze.zza(localContext, paramAdOverlayInfoParcel, bool2);
      return;
    }
  }
  
  public void zza(zzjq.zza paramzza)
  {
    zzGm = paramzza;
  }
  
  public void zza(zzjq.zzb paramzzb)
  {
    zzNC = paramzzb;
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    synchronized (zzpV)
    {
      List localList = (List)zzNA.get(paramString);
      Object localObject1 = localList;
      if (localList == null)
      {
        localObject1 = new CopyOnWriteArrayList();
        zzNA.put(paramString, localObject1);
      }
      ((List)localObject1).add(paramzzdf);
      return;
    }
  }
  
  public final void zza(boolean paramBoolean, int paramInt)
  {
    if ((zzpD.zzhY()) && (!zzpD.zzaN().zzui)) {}
    for (zza localzza = null;; localzza = zztz)
    {
      zza(new AdOverlayInfoParcel(localzza, zzNB, zzNF, zzpD, paramBoolean, paramInt, zzpD.zzhX()));
      return;
    }
  }
  
  public final void zza(boolean paramBoolean, int paramInt, String paramString)
  {
    Object localObject = null;
    boolean bool = zzpD.zzhY();
    zza localzza;
    if ((bool) && (!zzpD.zzaN().zzui))
    {
      localzza = null;
      if (!bool) {
        break label95;
      }
    }
    for (;;)
    {
      zza(new AdOverlayInfoParcel(localzza, (zzg)localObject, zzyW, zzNF, zzpD, paramBoolean, paramInt, paramString, zzpD.zzhX(), zzzD));
      return;
      localzza = zztz;
      break;
      label95:
      localObject = new zzjq.zzc(zzpD, zzNB);
    }
  }
  
  public final void zza(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = zzpD.zzhY();
    zza localzza;
    if ((bool) && (!zzpD.zzaN().zzui))
    {
      localzza = null;
      if (!bool) {
        break label97;
      }
    }
    label97:
    for (Object localObject = null;; localObject = new zzjq.zzc(zzpD, zzNB))
    {
      zza(new AdOverlayInfoParcel(localzza, (zzg)localObject, zzyW, zzNF, zzpD, paramBoolean, paramInt, paramString1, paramString2, zzpD.zzhX(), zzzD));
      return;
      localzza = zztz;
      break;
    }
  }
  
  public void zzb(zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, boolean paramBoolean, zzdh paramzzdh, zzdj paramzzdj, com.google.android.gms.ads.internal.zze paramzze, zzft paramzzft)
  {
    com.google.android.gms.ads.internal.zze localzze = paramzze;
    if (paramzze == null) {
      localzze = new com.google.android.gms.ads.internal.zze(false);
    }
    zzzB = new zzfn(zzpD, paramzzft);
    zza("/appEvent", new zzda(paramzzdb));
    zza("/backButton", zzde.zzzh);
    zza("/canOpenURLs", zzde.zzyY);
    zza("/canOpenIntents", zzde.zzyZ);
    zza("/click", zzde.zzza);
    zza("/close", zzde.zzzb);
    zza("/customClose", zzde.zzzd);
    zza("/instrument", zzde.zzzk);
    zza("/delayPageLoaded", new zzjq.zzd(this, null));
    zza("/httpTrack", zzde.zzze);
    zza("/log", zzde.zzzf);
    zza("/mraid", new zzdl(localzze, zzzB));
    zza("/mraidLoaded", zzNG);
    zza("/open", new zzdm(paramzzdh, localzze, zzzB));
    zza("/precache", zzde.zzzj);
    zza("/touch", zzde.zzzg);
    zza("/video", zzde.zzzi);
    zza("/appStreaming", zzde.zzzc);
    if (paramzzdj != null) {
      zza("/setInterstitialProperties", new zzdi(paramzzdj));
    }
    zztz = paramzza;
    zzNB = paramzzg;
    zzyW = paramzzdb;
    zzzD = paramzzdh;
    zzNF = paramzzp;
    zzzA = localzze;
    zzDk = paramzzft;
    zzzy = paramzzdj;
    zzG(paramBoolean);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    synchronized (zzpV)
    {
      paramString = (List)zzNA.get(paramString);
      if (paramString == null) {
        return;
      }
      paramString.remove(paramzzdf);
      return;
    }
  }
  
  public boolean zzcv()
  {
    synchronized (zzpV)
    {
      boolean bool = zzsz;
      return bool;
    }
  }
  
  public void zze(int paramInt1, int paramInt2)
  {
    if (zzzB != null) {
      zzzB.zze(paramInt1, paramInt2);
    }
  }
  
  public final void zzfo()
  {
    synchronized (zzpV)
    {
      zzND = false;
      zzsz = true;
      zzir.runOnUiThread(new zzjq.1(this));
      return;
    }
  }
  
  public void zzh(Uri paramUri)
  {
    Object localObject2 = paramUri.getPath();
    Object localObject1 = (List)zzNA.get(localObject2);
    if (localObject1 != null)
    {
      paramUri = zzr.zzbC().zze(paramUri);
      if (zzin.zzQ(2))
      {
        zzin.v("Received GMSG: " + (String)localObject2);
        localObject2 = paramUri.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          zzin.v("  " + str + ": " + (String)paramUri.get(str));
        }
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((zzdf)((Iterator)localObject1).next()).zza(zzpD, paramUri);
      }
    }
    zzin.v("No GMSG handler found for GMSG: " + paramUri);
  }
  
  public void zzh(zzjp paramzzjp)
  {
    zzpD = paramzzjp;
  }
  
  public com.google.android.gms.ads.internal.zze zzig()
  {
    return zzzA;
  }
  
  public boolean zzih()
  {
    synchronized (zzpV)
    {
      boolean bool = zzNE;
      return bool;
    }
  }
  
  public void zzii()
  {
    synchronized (zzpV)
    {
      zzin.v("Loading blank page in WebView, 2...");
      zzNH = true;
      zzpD.zzaL("about:blank");
      return;
    }
  }
  
  public final void zzim()
  {
    zzjq.zza localzza;
    zzjp localzzjp;
    if ((zzGm != null) && (((zzNI) && (zzNK <= 0)) || (zzNJ)))
    {
      localzza = zzGm;
      localzzjp = zzpD;
      if (zzNJ) {
        break label70;
      }
    }
    label70:
    for (boolean bool = true;; bool = false)
    {
      localzza.zza(localzzjp, bool);
      zzGm = null;
      zzpD.zzie();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */