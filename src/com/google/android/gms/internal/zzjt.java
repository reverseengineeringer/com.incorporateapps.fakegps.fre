package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class zzjt
  extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzjp
{
  private AdSizeParcel zzCh;
  private int zzDC = -1;
  private int zzDD = -1;
  private int zzDF = -1;
  private int zzDG = -1;
  private String zzEY = "";
  private Boolean zzLB;
  private final zzjt.zza zzNP;
  private zzjq zzNQ;
  private com.google.android.gms.ads.internal.overlay.zzd zzNR;
  private boolean zzNS;
  private boolean zzNT;
  private boolean zzNU;
  private boolean zzNV;
  private int zzNW;
  private boolean zzNX = true;
  private zzbz zzNY;
  private zzbz zzNZ;
  private zzbz zzOa;
  private zzca zzOb;
  private WeakReference zzOc;
  private com.google.android.gms.ads.internal.overlay.zzd zzOd;
  private Map zzOe;
  private final VersionInfoParcel zzpT;
  private final Object zzpV = new Object();
  private final com.google.android.gms.ads.internal.zzd zzpm;
  private zzjc zzrV;
  private final WindowManager zzsb;
  private final zzan zzyt;
  
  protected zzjt(zzjt.zza paramzza, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    super(paramzza);
    zzNP = paramzza;
    zzCh = paramAdSizeParcel;
    zzNU = paramBoolean1;
    zzNW = -1;
    zzyt = paramzzan;
    zzpT = paramVersionInfoParcel;
    zzpm = paramzzd;
    zzsb = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    paramAdSizeParcel = getSettings();
    paramAdSizeParcel.setAllowFileAccess(false);
    paramAdSizeParcel.setJavaScriptEnabled(true);
    paramAdSizeParcel.setSavePassword(false);
    paramAdSizeParcel.setSupportMultipleWindows(true);
    paramAdSizeParcel.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21) {
      paramAdSizeParcel.setMixedContentMode(0);
    }
    zzr.zzbC().zza(paramzza, afmaVersion, paramAdSizeParcel);
    zzr.zzbE().zza(getContext(), paramAdSizeParcel);
    setDownloadListener(this);
    zziq();
    if (zzne.zzsi()) {
      addJavascriptInterface(new zzju(this), "googleAdsJsInterface");
    }
    zzrV = new zzjc(zzNP.zzhP(), this, null);
    zzd(paramzzcb);
  }
  
  static zzjt zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    return new zzjt(new zzjt.zza(paramContext), paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, paramzzcb, paramzzd);
  }
  
  private void zzd(zzcb paramzzcb)
  {
    zziu();
    zzOb = new zzca(new zzcb(true, "make_wv", zzCh.zzuh));
    zzOb.zzdA().zzc(paramzzcb);
    zzNZ = zzbx.zzb(zzOb.zzdA());
    zzOb.zza("native:view_create", zzNZ);
    zzOa = null;
    zzNY = null;
  }
  
  private void zzio()
  {
    synchronized (zzpV)
    {
      zzLB = zzr.zzbF().zzhg();
      Boolean localBoolean = zzLB;
      if (localBoolean == null) {}
      try
      {
        evaluateJavascript("(function(){})()", null);
        zzb(Boolean.valueOf(true));
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          zzb(Boolean.valueOf(false));
        }
      }
    }
  }
  
  private void zzip()
  {
    zzbx.zza(zzOb.zzdA(), zzNY, new String[] { "aeh" });
  }
  
  private void zziq()
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if ((zzNU) || (zzCh.zzui))
        {
          if (Build.VERSION.SDK_INT < 14)
          {
            zzin.zzaI("Disabling hardware acceleration on an overlay.");
            zzir();
            return;
          }
          zzin.zzaI("Enabling hardware acceleration on an overlay.");
          zzis();
        }
      }
      if (Build.VERSION.SDK_INT < 18)
      {
        zzin.zzaI("Disabling hardware acceleration on an AdView.");
        zzir();
      }
      else
      {
        zzin.zzaI("Enabling hardware acceleration on an AdView.");
        zzis();
      }
    }
  }
  
  private void zzir()
  {
    synchronized (zzpV)
    {
      if (!zzNV) {
        zzr.zzbE().zzn(this);
      }
      zzNV = true;
      return;
    }
  }
  
  private void zzis()
  {
    synchronized (zzpV)
    {
      if (zzNV) {
        zzr.zzbE().zzm(this);
      }
      zzNV = false;
      return;
    }
  }
  
  private void zzit()
  {
    synchronized (zzpV)
    {
      if (zzOe != null)
      {
        Iterator localIterator = zzOe.values().iterator();
        if (localIterator.hasNext()) {
          ((zzdr)localIterator.next()).release();
        }
      }
    }
  }
  
  private void zziu()
  {
    if (zzOb == null) {}
    zzcb localzzcb;
    do
    {
      return;
      localzzcb = zzOb.zzdA();
    } while ((localzzcb == null) || (zzr.zzbF().zzhb() == null));
    zzr.zzbF().zzhb().zza(localzzcb);
  }
  
  public void destroy()
  {
    synchronized (zzpV)
    {
      zziu();
      zzrV.zzhF();
      if (zzNR != null)
      {
        zzNR.close();
        zzNR.onDestroy();
        zzNR = null;
      }
      zzNQ.reset();
      if (zzNT) {
        return;
      }
      zzr.zzbR().zzd(this);
      zzit();
      zzNT = true;
      zzin.v("Initiating WebView self destruct sequence in 3...");
      zzNQ.zzii();
      return;
    }
  }
  
  public void evaluateJavascript(String paramString, ValueCallback paramValueCallback)
  {
    synchronized (zzpV)
    {
      if (isDestroyed())
      {
        zzin.zzaK("The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null) {
          paramValueCallback.onReceiveValue(null);
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
  }
  
  protected void finalize()
  {
    synchronized (zzpV)
    {
      if (!zzNT)
      {
        zzr.zzbR().zzd(this);
        zzit();
      }
      super.finalize();
      return;
    }
  }
  
  public String getRequestId()
  {
    synchronized (zzpV)
    {
      String str = zzEY;
      return str;
    }
  }
  
  public int getRequestedOrientation()
  {
    synchronized (zzpV)
    {
      int i = zzNW;
      return i;
    }
  }
  
  public View getView()
  {
    return this;
  }
  
  public WebView getWebView()
  {
    return this;
  }
  
  public boolean isDestroyed()
  {
    synchronized (zzpV)
    {
      boolean bool = zzNT;
      return bool;
    }
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    synchronized (zzpV)
    {
      if (!isDestroyed())
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    synchronized (zzpV)
    {
      if (!isDestroyed())
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }
  
  public void loadUrl(String paramString)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        boolean bool = isDestroyed();
        if (!bool) {
          try
          {
            super.loadUrl(paramString);
            return;
          }
          catch (Throwable paramString)
          {
            zzin.zzaK("Could not call loadUrl. " + paramString);
            continue;
          }
        }
      }
      zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }
  
  protected void onAttachedToWindow()
  {
    synchronized (zzpV)
    {
      super.onAttachedToWindow();
      if (!isDestroyed()) {
        zzrV.onAttachedToWindow();
      }
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    synchronized (zzpV)
    {
      if (!isDestroyed()) {
        zzrV.onDetachedFromWindow();
      }
      super.onDetachedFromWindow();
      return;
    }
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString2 = new Intent("android.intent.action.VIEW");
      paramString2.setDataAndType(Uri.parse(paramString1), paramString4);
      zzr.zzbC().zzb(getContext(), paramString2);
      return;
    }
    catch (ActivityNotFoundException paramString2)
    {
      zzin.zzaI("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (isDestroyed()) {}
    while ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow())) {
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public void onGlobalLayout()
  {
    boolean bool = zzin();
    com.google.android.gms.ads.internal.overlay.zzd localzzd = zzhS();
    if ((localzzd != null) && (bool)) {
      localzzd.zzfq();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = Integer.MAX_VALUE;
    synchronized (zzpV)
    {
      if (isDestroyed())
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((isInEditMode()) || (zzNU) || (zzCh.zzuk) || (zzCh.zzul))
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
    }
    if (zzCh.zzui)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      zzsb.getDefaultDisplay().getMetrics(localDisplayMetrics);
      setMeasuredDimension(widthPixels, heightPixels);
      return;
    }
    int n = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt2);
    if (n != Integer.MIN_VALUE) {
      if (n == 1073741824) {
        break label365;
      }
    }
    for (;;)
    {
      if ((zzCh.widthPixels > paramInt1) || (zzCh.heightPixels > paramInt2))
      {
        float f = zzNP.getResources().getDisplayMetrics().density;
        zzin.zzaK("Not enough space to show ad. Needs " + (int)(zzCh.widthPixels / f) + "x" + (int)(zzCh.heightPixels / f) + " dp, but only has " + (int)(i / f) + "x" + (int)(k / f) + " dp.");
        if (getVisibility() != 8) {
          setVisibility(4);
        }
        setMeasuredDimension(0, 0);
      }
      for (;;)
      {
        return;
        if (getVisibility() != 8) {
          setVisibility(0);
        }
        setMeasuredDimension(zzCh.widthPixels, zzCh.heightPixels);
      }
      paramInt1 = Integer.MAX_VALUE;
      break label368;
      label365:
      paramInt1 = i;
      label368:
      if (m != Integer.MIN_VALUE)
      {
        paramInt2 = j;
        if (m != 1073741824) {}
      }
      else
      {
        paramInt2 = k;
      }
    }
  }
  
  public void onPause()
  {
    if (isDestroyed()) {}
    for (;;)
    {
      return;
      try
      {
        if (zzne.zzsd())
        {
          super.onPause();
          return;
        }
      }
      catch (Exception localException)
      {
        zzin.zzb("Could not pause webview.", localException);
      }
    }
  }
  
  public void onResume()
  {
    if (isDestroyed()) {}
    for (;;)
    {
      return;
      try
      {
        if (zzne.zzsd())
        {
          super.onResume();
          return;
        }
      }
      catch (Exception localException)
      {
        zzin.zzb("Could not resume webview.", localException);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (zzyt != null) {
      zzyt.zza(paramMotionEvent);
    }
    if (isDestroyed()) {
      return false;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setContext(Context paramContext)
  {
    zzNP.setBaseContext(paramContext);
    zzrV.zzi(zzNP.zzhP());
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    zzOc = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    synchronized (zzpV)
    {
      zzNW = paramInt;
      if (zzNR != null) {
        zzNR.setRequestedOrientation(zzNW);
      }
      return;
    }
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    if ((paramWebViewClient instanceof zzjq)) {
      zzNQ = ((zzjq)paramWebViewClient);
    }
  }
  
  public void stopLoading()
  {
    if (isDestroyed()) {
      return;
    }
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      zzin.zzb("Could not stop loading webview.", localException);
    }
  }
  
  public void zzD(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      zzNU = paramBoolean;
      zziq();
      return;
    }
  }
  
  public void zzE(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      if (zzNR != null)
      {
        zzNR.zza(zzNQ.zzcv(), paramBoolean);
        return;
      }
      zzNS = paramBoolean;
    }
  }
  
  public void zzF(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      zzNX = paramBoolean;
      return;
    }
  }
  
  public void zza(Context paramContext, AdSizeParcel paramAdSizeParcel, zzcb paramzzcb)
  {
    synchronized (zzpV)
    {
      zzrV.zzhF();
      setContext(paramContext);
      zzNR = null;
      zzCh = paramAdSizeParcel;
      zzNU = false;
      zzNS = false;
      zzEY = "";
      zzNW = -1;
      zzr.zzbE().zzj(this);
      loadUrl("about:blank");
      zzNQ.reset();
      setOnTouchListener(null);
      setOnClickListener(null);
      zzNX = true;
      zzd(paramzzcb);
      return;
    }
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    synchronized (zzpV)
    {
      zzCh = paramAdSizeParcel;
      requestLayout();
      return;
    }
  }
  
  public void zza(zzau paramzzau, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {}
    for (paramzzau = "1";; paramzzau = "0")
    {
      localHashMap.put("isVisible", paramzzau);
      zza("onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  protected void zza(String paramString, ValueCallback paramValueCallback)
  {
    synchronized (zzpV)
    {
      if (!isDestroyed()) {
        evaluateJavascript(paramString, paramValueCallback);
      }
      do
      {
        return;
        zzin.zzaK("The webview is destroyed. Ignoring action.");
      } while (paramValueCallback == null);
      paramValueCallback.onReceiveValue(null);
    }
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    if (zzNQ != null) {
      zzNQ.zza(paramString, paramzzdf);
    }
  }
  
  public void zza(String paramString, Map paramMap)
  {
    try
    {
      paramMap = zzr.zzbC().zzG(paramMap);
      zzb(paramString, paramMap);
      return;
    }
    catch (JSONException paramString)
    {
      zzin.zzaK("Could not convert parameters to JSON.");
    }
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject;
    if (paramJSONObject == null) {
      localJSONObject = new JSONObject();
    }
    zze(paramString, localJSONObject.toString());
  }
  
  public void zzaL(String paramString)
  {
    synchronized (zzpV)
    {
      try
      {
        super.loadUrl(paramString);
        return;
      }
      catch (Throwable paramString)
      {
        for (;;)
        {
          zzin.zzaK("Could not call loadUrl. " + paramString);
        }
      }
    }
  }
  
  public void zzaM(String paramString)
  {
    Object localObject = zzpV;
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    try
    {
      zzEY = str;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public AdSizeParcel zzaN()
  {
    synchronized (zzpV)
    {
      AdSizeParcel localAdSizeParcel = zzCh;
      return localAdSizeParcel;
    }
  }
  
  protected void zzaO(String paramString)
  {
    synchronized (zzpV)
    {
      if (!isDestroyed())
      {
        loadUrl(paramString);
        return;
      }
      zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }
  
  protected void zzaP(String paramString)
  {
    if (zzne.zzsk())
    {
      if (zzhg() == null) {
        zzio();
      }
      if (zzhg().booleanValue())
      {
        zza(paramString, null);
        return;
      }
      zzaO("javascript:" + paramString);
      return;
    }
    zzaO("javascript:" + paramString);
  }
  
  public void zzb(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    synchronized (zzpV)
    {
      zzNR = paramzzd;
      return;
    }
  }
  
  void zzb(Boolean paramBoolean)
  {
    zzLB = paramBoolean;
    zzr.zzbF().zzb(paramBoolean);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    if (zzNQ != null) {
      zzNQ.zzb(paramString, paramzzdf);
    }
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = new JSONObject();
    }
    paramJSONObject = ((JSONObject)localObject).toString();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("AFMA_ReceiveMessage('");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("'");
    ((StringBuilder)localObject).append(",");
    ((StringBuilder)localObject).append(paramJSONObject);
    ((StringBuilder)localObject).append(");");
    zzin.v("Dispatching AFMA event: " + ((StringBuilder)localObject).toString());
    zzaP(((StringBuilder)localObject).toString());
  }
  
  public void zzc(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    synchronized (zzpV)
    {
      zzOd = paramzzd;
      return;
    }
  }
  
  public void zze(String paramString1, String paramString2)
  {
    zzaP(paramString1 + "(" + paramString2 + ");");
  }
  
  public boolean zzfL()
  {
    synchronized (zzpV)
    {
      zzbx.zza(zzOb.zzdA(), zzNY, new String[] { "aebb" });
      boolean bool = zzNX;
      return bool;
    }
  }
  
  public void zzfr()
  {
    if (zzNY == null)
    {
      zzbx.zza(zzOb.zzdA(), zzOa, new String[] { "aes" });
      zzNY = zzbx.zzb(zzOb.zzdA());
      zzOb.zza("native:view_show", zzNY);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", zzpT.afmaVersion);
    zza("onshow", localHashMap);
  }
  
  public void zzhN()
  {
    zzip();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", zzpT.afmaVersion);
    zza("onhide", localHashMap);
  }
  
  public void zzhO()
  {
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("app_volume", String.valueOf(zzr.zzbC().zzbt()));
    localHashMap.put("device_volume", String.valueOf(zzr.zzbC().zzQ(getContext())));
    zza("volume", localHashMap);
  }
  
  public Activity zzhP()
  {
    return zzNP.zzhP();
  }
  
  public Context zzhQ()
  {
    return zzNP.zzhQ();
  }
  
  public com.google.android.gms.ads.internal.zzd zzhR()
  {
    return zzpm;
  }
  
  public com.google.android.gms.ads.internal.overlay.zzd zzhS()
  {
    synchronized (zzpV)
    {
      com.google.android.gms.ads.internal.overlay.zzd localzzd = zzNR;
      return localzzd;
    }
  }
  
  public com.google.android.gms.ads.internal.overlay.zzd zzhT()
  {
    synchronized (zzpV)
    {
      com.google.android.gms.ads.internal.overlay.zzd localzzd = zzOd;
      return localzzd;
    }
  }
  
  public zzjq zzhU()
  {
    return zzNQ;
  }
  
  public boolean zzhV()
  {
    return zzNS;
  }
  
  public zzan zzhW()
  {
    return zzyt;
  }
  
  public VersionInfoParcel zzhX()
  {
    return zzpT;
  }
  
  public boolean zzhY()
  {
    synchronized (zzpV)
    {
      boolean bool = zzNU;
      return bool;
    }
  }
  
  public void zzhZ()
  {
    synchronized (zzpV)
    {
      zzin.v("Destroying WebView!");
      zzir.zzMc.post(new zzjt.1(this));
      return;
    }
  }
  
  Boolean zzhg()
  {
    synchronized (zzpV)
    {
      Boolean localBoolean = zzLB;
      return localBoolean;
    }
  }
  
  public zzjo zzia()
  {
    return null;
  }
  
  public zzbz zzib()
  {
    return zzOa;
  }
  
  public zzca zzic()
  {
    return zzOb;
  }
  
  public void zzid()
  {
    zzrV.zzhE();
  }
  
  public void zzie()
  {
    if (zzOa == null)
    {
      zzOa = zzbx.zzb(zzOb.zzdA());
      zzOb.zza("native:view_load", zzOa);
    }
  }
  
  public View.OnClickListener zzif()
  {
    return (View.OnClickListener)zzOc.get();
  }
  
  public boolean zzin()
  {
    if (!zzhU().zzcv()) {
      return false;
    }
    DisplayMetrics localDisplayMetrics = zzr.zzbC().zza(zzsb);
    int k = zzn.zzcS().zzb(localDisplayMetrics, widthPixels);
    int m = zzn.zzcS().zzb(localDisplayMetrics, heightPixels);
    Object localObject = zzhP();
    int j;
    int i;
    if ((localObject == null) || (((Activity)localObject).getWindow() == null))
    {
      j = m;
      i = k;
      label77:
      if ((zzDC == k) && (zzDD == m) && (zzDF == i) && (zzDG == j)) {
        break label224;
      }
      if ((zzDC == k) && (zzDD == m)) {
        break label226;
      }
    }
    label224:
    label226:
    for (boolean bool = true;; bool = false)
    {
      zzDC = k;
      zzDD = m;
      zzDF = i;
      zzDG = j;
      new zzfs(this).zza(k, m, i, j, density, zzsb.getDefaultDisplay().getRotation());
      return bool;
      localObject = zzr.zzbC().zze((Activity)localObject);
      i = zzn.zzcS().zzb(localDisplayMetrics, localObject[0]);
      j = zzn.zzcS().zzb(localDisplayMetrics, localObject[1]);
      break label77;
      break;
    }
  }
  
  public void zzy(int paramInt)
  {
    zzip();
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", zzpT.afmaVersion);
    zza("onhide", localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */