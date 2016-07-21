package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

class zzjs
  extends FrameLayout
  implements zzjp
{
  private final zzjp zzNN;
  private final zzjo zzNO;
  
  public zzjs(zzjp paramzzjp)
  {
    super(paramzzjp.getContext());
    zzNN = paramzzjp;
    zzNO = new zzjo(paramzzjp.zzhQ(), this, this);
    paramzzjp = zzNN.zzhU();
    if (paramzzjp != null) {
      paramzzjp.zzh(this);
    }
    addView(zzNN.getView());
  }
  
  public void clearCache(boolean paramBoolean)
  {
    zzNN.clearCache(paramBoolean);
  }
  
  public void destroy()
  {
    zzNN.destroy();
  }
  
  public String getRequestId()
  {
    return zzNN.getRequestId();
  }
  
  public int getRequestedOrientation()
  {
    return zzNN.getRequestedOrientation();
  }
  
  public View getView()
  {
    return this;
  }
  
  public WebView getWebView()
  {
    return zzNN.getWebView();
  }
  
  public boolean isDestroyed()
  {
    return zzNN.isDestroyed();
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    zzNN.loadData(paramString1, paramString2, paramString3);
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    zzNN.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public void loadUrl(String paramString)
  {
    zzNN.loadUrl(paramString);
  }
  
  public void onPause()
  {
    zzNO.onPause();
    zzNN.onPause();
  }
  
  public void onResume()
  {
    zzNN.onResume();
  }
  
  public void setBackgroundColor(int paramInt)
  {
    zzNN.setBackgroundColor(paramInt);
  }
  
  public void setContext(Context paramContext)
  {
    zzNN.setContext(paramContext);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    zzNN.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    zzNN.setOnTouchListener(paramOnTouchListener);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    zzNN.setRequestedOrientation(paramInt);
  }
  
  public void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    zzNN.setWebChromeClient(paramWebChromeClient);
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    zzNN.setWebViewClient(paramWebViewClient);
  }
  
  public void stopLoading()
  {
    zzNN.stopLoading();
  }
  
  public void zzD(boolean paramBoolean)
  {
    zzNN.zzD(paramBoolean);
  }
  
  public void zzE(boolean paramBoolean)
  {
    zzNN.zzE(paramBoolean);
  }
  
  public void zzF(boolean paramBoolean)
  {
    zzNN.zzF(paramBoolean);
  }
  
  public void zza(Context paramContext, AdSizeParcel paramAdSizeParcel, zzcb paramzzcb)
  {
    zzNN.zza(paramContext, paramAdSizeParcel, paramzzcb);
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    zzNN.zza(paramAdSizeParcel);
  }
  
  public void zza(zzau paramzzau, boolean paramBoolean)
  {
    zzNN.zza(paramzzau, paramBoolean);
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    zzNN.zza(paramString, paramzzdf);
  }
  
  public void zza(String paramString, Map paramMap)
  {
    zzNN.zza(paramString, paramMap);
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    zzNN.zza(paramString, paramJSONObject);
  }
  
  public void zzaL(String paramString)
  {
    zzNN.zzaL(paramString);
  }
  
  public void zzaM(String paramString)
  {
    zzNN.zzaM(paramString);
  }
  
  public AdSizeParcel zzaN()
  {
    return zzNN.zzaN();
  }
  
  public void zzb(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    zzNN.zzb(paramzzd);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    zzNN.zzb(paramString, paramzzdf);
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    zzNN.zzb(paramString, paramJSONObject);
  }
  
  public void zzc(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    zzNN.zzc(paramzzd);
  }
  
  public void zze(String paramString1, String paramString2)
  {
    zzNN.zze(paramString1, paramString2);
  }
  
  public boolean zzfL()
  {
    return zzNN.zzfL();
  }
  
  public void zzfr()
  {
    zzNN.zzfr();
  }
  
  public void zzhN()
  {
    zzNN.zzhN();
  }
  
  public void zzhO()
  {
    zzNN.zzhO();
  }
  
  public Activity zzhP()
  {
    return zzNN.zzhP();
  }
  
  public Context zzhQ()
  {
    return zzNN.zzhQ();
  }
  
  public com.google.android.gms.ads.internal.zzd zzhR()
  {
    return zzNN.zzhR();
  }
  
  public com.google.android.gms.ads.internal.overlay.zzd zzhS()
  {
    return zzNN.zzhS();
  }
  
  public com.google.android.gms.ads.internal.overlay.zzd zzhT()
  {
    return zzNN.zzhT();
  }
  
  public zzjq zzhU()
  {
    return zzNN.zzhU();
  }
  
  public boolean zzhV()
  {
    return zzNN.zzhV();
  }
  
  public zzan zzhW()
  {
    return zzNN.zzhW();
  }
  
  public VersionInfoParcel zzhX()
  {
    return zzNN.zzhX();
  }
  
  public boolean zzhY()
  {
    return zzNN.zzhY();
  }
  
  public void zzhZ()
  {
    zzNO.onDestroy();
    zzNN.zzhZ();
  }
  
  public zzjo zzia()
  {
    return zzNO;
  }
  
  public zzbz zzib()
  {
    return zzNN.zzib();
  }
  
  public zzca zzic()
  {
    return zzNN.zzic();
  }
  
  public void zzid()
  {
    zzNN.zzid();
  }
  
  public void zzie()
  {
    zzNN.zzie();
  }
  
  public View.OnClickListener zzif()
  {
    return zzNN.zzif();
  }
  
  public void zzy(int paramInt)
  {
    zzNN.zzy(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */