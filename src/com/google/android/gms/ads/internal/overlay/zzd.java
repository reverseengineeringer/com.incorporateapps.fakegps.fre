package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzfv.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;
import java.util.Collections;
import java.util.Map;

public class zzd
  extends zzfv.zza
  implements zzs
{
  static final int zzEg = Color.argb(0, 0, 0, 0);
  private final Activity mActivity;
  RelativeLayout zzDm;
  AdOverlayInfoParcel zzEh;
  zzd.zzc zzEi;
  zzo zzEj;
  boolean zzEk = false;
  FrameLayout zzEl;
  WebChromeClient.CustomViewCallback zzEm;
  boolean zzEn = false;
  boolean zzEo = false;
  boolean zzEp = false;
  int zzEq = 0;
  zzl zzEr;
  private boolean zzEs;
  private boolean zzEt = false;
  private boolean zzEu = true;
  zzjp zzpD;
  
  public zzd(Activity paramActivity)
  {
    mActivity = paramActivity;
    zzEr = new zzq();
  }
  
  public void close()
  {
    zzEq = 2;
    mActivity.finish();
  }
  
  public void onBackPressed()
  {
    zzEq = 0;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    zzEn = bool;
    try
    {
      zzEh = AdOverlayInfoParcel.zzb(mActivity.getIntent());
      if (zzEh != null) {
        break label71;
      }
      throw new zzd.zza("Could not get info for ad overlay.");
    }
    catch (zzd.zza paramBundle)
    {
      zzin.zzaK(paramBundle.getMessage());
      zzEq = 3;
      mActivity.finish();
    }
    return;
    label71:
    if (zzEh.zzrl.zzNa > 7500000) {
      zzEq = 3;
    }
    if (mActivity.getIntent() != null) {
      zzEu = mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
    }
    if (zzEh.zzEM != null)
    {
      zzEo = zzEh.zzEM.zzql;
      label142:
      if ((((Boolean)zzbt.zzxe.get()).booleanValue()) && (zzEo) && (zzEh.zzEM.zzqn != null)) {
        new zzd.zzd(this, null).zzhn();
      }
      if (paramBundle == null)
      {
        if ((zzEh.zzEC != null) && (zzEu)) {
          zzEh.zzEC.zzaX();
        }
        if ((zzEh.zzEJ != 1) && (zzEh.zzEB != null)) {
          zzEh.zzEB.onAdClicked();
        }
      }
      zzDm = new zzd.zzb(mActivity, zzEh.zzEL);
      zzDm.setId(1000);
      switch (zzEh.zzEJ)
      {
      }
    }
    for (;;)
    {
      throw new zzd.zza("Could not determine ad overlay type.");
      zzEo = false;
      break label142;
      zzx(false);
      return;
      zzEi = new zzd.zzc(zzEh.zzED);
      zzx(false);
      return;
      zzx(true);
      return;
      if (zzEn)
      {
        zzEq = 3;
        mActivity.finish();
        return;
      }
      if (zzr.zzbz().zza(mActivity, zzEh.zzEA, zzEh.zzEI)) {
        break;
      }
      zzEq = 3;
      mActivity.finish();
      return;
    }
  }
  
  public void onDestroy()
  {
    if (zzpD != null) {
      zzDm.removeView(zzpD.getView());
    }
    zzfp();
  }
  
  public void onPause()
  {
    zzEr.pause();
    zzfl();
    if (zzEh.zzEC != null) {
      zzEh.zzEC.onPause();
    }
    if ((zzpD != null) && ((!mActivity.isFinishing()) || (zzEi == null))) {
      zzr.zzbE().zzi(zzpD);
    }
    zzfp();
  }
  
  public void onRestart() {}
  
  public void onResume()
  {
    if ((zzEh != null) && (zzEh.zzEJ == 4))
    {
      if (zzEn)
      {
        zzEq = 3;
        mActivity.finish();
      }
    }
    else
    {
      if (zzEh.zzEC != null) {
        zzEh.zzEC.onResume();
      }
      if ((zzpD == null) || (zzpD.isDestroyed())) {
        break label107;
      }
      zzr.zzbE().zzj(zzpD);
    }
    for (;;)
    {
      zzEr.resume();
      return;
      zzEn = true;
      break;
      label107:
      zzin.zzaK("The webview does not exit. Ignoring action.");
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", zzEn);
  }
  
  public void onStart() {}
  
  public void onStop()
  {
    zzfp();
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    mActivity.setRequestedOrientation(paramInt);
  }
  
  public void zza(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    zzEl = new FrameLayout(mActivity);
    zzEl.setBackgroundColor(-16777216);
    zzEl.addView(paramView, -1, -1);
    mActivity.setContentView(zzEl);
    zzaD();
    zzEm = paramCustomViewCallback;
    zzEk = true;
  }
  
  public void zza(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (zzEj != null) {
      zzEj.zza(paramBoolean1, paramBoolean2);
    }
  }
  
  public void zzaD()
  {
    zzEs = true;
  }
  
  public void zzfl()
  {
    if ((zzEh != null) && (zzEk)) {
      setRequestedOrientation(zzEh.orientation);
    }
    if (zzEl != null)
    {
      mActivity.setContentView(zzDm);
      zzaD();
      zzEl.removeAllViews();
      zzEl = null;
    }
    if (zzEm != null)
    {
      zzEm.onCustomViewHidden();
      zzEm = null;
    }
    zzEk = false;
  }
  
  public void zzfm()
  {
    zzEq = 1;
    mActivity.finish();
  }
  
  public boolean zzfn()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    zzEq = 0;
    if (zzpD == null) {
      return bool2;
    }
    if ((zzpD.zzfL()) && (zzEr.zzfL())) {}
    for (;;)
    {
      bool2 = bool1;
      if (bool1) {
        break;
      }
      zzpD.zza("onbackblocked", Collections.emptyMap());
      return bool1;
      bool1 = false;
    }
  }
  
  public void zzfo()
  {
    zzDm.removeView(zzEj);
    zzw(true);
  }
  
  protected void zzfp()
  {
    if ((!mActivity.isFinishing()) || (zzEt)) {
      return;
    }
    zzEt = true;
    if (zzpD != null)
    {
      zzy(zzEq);
      zzDm.removeView(zzpD.getView());
      if (zzEi == null) {
        break label169;
      }
      zzpD.setContext(zzEi.context);
      zzpD.zzD(false);
      zzEi.zzEx.addView(zzpD.getView(), zzEi.index, zzEi.zzEw);
      zzEi = null;
    }
    for (;;)
    {
      zzpD = null;
      if ((zzEh != null) && (zzEh.zzEC != null)) {
        zzEh.zzEC.zzaW();
      }
      zzEr.destroy();
      return;
      label169:
      if (mActivity.getApplicationContext() != null) {
        zzpD.setContext(mActivity.getApplicationContext());
      }
    }
  }
  
  public void zzfq()
  {
    if (zzEp)
    {
      zzEp = false;
      zzfr();
    }
  }
  
  protected void zzfr()
  {
    zzpD.zzfr();
  }
  
  public void zzg(zzjp paramzzjp, Map paramMap)
  {
    zzEr.zzg(paramzzjp, paramMap);
  }
  
  public void zzw(boolean paramBoolean)
  {
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i = 50;
      zzEj = new zzo(mActivity, i, this);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean) {
        break label88;
      }
    }
    label88:
    for (int i = 11;; i = 9)
    {
      localLayoutParams.addRule(i);
      zzEj.zza(paramBoolean, zzEh.zzEG);
      zzDm.addView(zzEj, localLayoutParams);
      return;
      i = 32;
      break;
    }
  }
  
  protected void zzx(boolean paramBoolean)
  {
    if (!zzEs) {
      mActivity.requestWindowFeature(1);
    }
    Object localObject = mActivity.getWindow();
    if (localObject == null) {
      throw new zzd.zza("Invalid activity, no window available.");
    }
    if ((!zzEo) || ((zzEh.zzEM != null) && (zzEh.zzEM.zzqm))) {
      ((Window)localObject).setFlags(1024, 1024);
    }
    boolean bool2 = zzEh.zzED.zzhU().zzcv();
    zzEp = false;
    boolean bool1;
    if (bool2)
    {
      if (zzEh.orientation != zzr.zzbE().zzhv()) {
        break label588;
      }
      if (mActivity.getResources().getConfiguration().orientation == 1)
      {
        bool1 = true;
        zzEp = bool1;
      }
    }
    else
    {
      label147:
      zzin.zzaI("Delay onShow to next orientation change: " + zzEp);
      setRequestedOrientation(zzEh.orientation);
      if (zzr.zzbE().zza((Window)localObject)) {
        zzin.zzaI("Hardware acceleration on the AdActivity window enabled.");
      }
      if (zzEo) {
        break label636;
      }
      zzDm.setBackgroundColor(-16777216);
      label215:
      mActivity.setContentView(zzDm);
      zzaD();
      if (!paramBoolean) {
        break label703;
      }
      zzpD = zzr.zzbD().zza(mActivity, zzEh.zzED.zzaN(), true, bool2, null, zzEh.zzrl, null, zzEh.zzED.zzhR());
      zzpD.zzhU().zzb(null, null, zzEh.zzEE, zzEh.zzEI, true, zzEh.zzEK, null, zzEh.zzED.zzhU().zzig(), null);
      zzpD.zzhU().zza(new zzd.1(this));
      if (zzEh.url == null) {
        break label649;
      }
      zzpD.loadUrl(zzEh.url);
      label382:
      if (zzEh.zzED != null) {
        zzEh.zzED.zzc(this);
      }
      label405:
      zzpD.zzb(this);
      localObject = zzpD.getParent();
      if ((localObject != null) && ((localObject instanceof ViewGroup))) {
        ((ViewGroup)localObject).removeView(zzpD.getView());
      }
      if (zzEo) {
        zzpD.setBackgroundColor(zzEg);
      }
      zzDm.addView(zzpD.getView(), -1, -1);
      if ((!paramBoolean) && (!zzEp)) {
        zzfr();
      }
      zzw(bool2);
      if (zzpD.zzhV()) {
        zza(bool2, true);
      }
      localObject = zzpD.zzhR();
      if (localObject == null) {
        break label730;
      }
    }
    label588:
    label636:
    label649:
    label703:
    label730:
    for (localObject = zzpy;; localObject = null)
    {
      if (localObject == null) {
        break label736;
      }
      zzEr = ((zzm)localObject).zza(mActivity, zzpD, zzDm);
      return;
      bool1 = false;
      break;
      if (zzEh.orientation != zzr.zzbE().zzhw()) {
        break label147;
      }
      if (mActivity.getResources().getConfiguration().orientation == 2) {}
      for (bool1 = true;; bool1 = false)
      {
        zzEp = bool1;
        break;
      }
      zzDm.setBackgroundColor(zzEg);
      break label215;
      if (zzEh.zzEH != null)
      {
        zzpD.loadDataWithBaseURL(zzEh.zzEF, zzEh.zzEH, "text/html", "UTF-8", null);
        break label382;
      }
      throw new zzd.zza("No URL or HTML to display in ad overlay.");
      zzpD = zzEh.zzED;
      zzpD.setContext(mActivity);
      break label405;
    }
    label736:
    zzin.zzaK("Appstreaming controller is null.");
  }
  
  protected void zzy(int paramInt)
  {
    zzpD.zzy(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */