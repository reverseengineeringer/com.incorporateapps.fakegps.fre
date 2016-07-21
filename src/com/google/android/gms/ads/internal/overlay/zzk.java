package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;
import java.util.HashMap;

public class zzk
  extends FrameLayout
  implements zzh
{
  private final FrameLayout zzEN;
  private final zzu zzEO;
  private zzi zzEP;
  private boolean zzEQ;
  private boolean zzER;
  private TextView zzES;
  private long zzET;
  private long zzEU;
  private String zzEV;
  private final zzjp zzpD;
  private String zzzK;
  
  public zzk(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz)
  {
    super(paramContext);
    zzpD = paramzzjp;
    zzEN = new FrameLayout(paramContext);
    addView(zzEN, new FrameLayout.LayoutParams(-1, -1));
    zzb.zzv(paramzzjp.zzhR());
    zzEP = zzhRzzpx.zza(paramContext, paramzzjp, paramInt, paramzzcb, paramzzbz);
    if (zzEP != null) {
      zzEN.addView(zzEP, new FrameLayout.LayoutParams(-1, -1, 17));
    }
    zzES = new TextView(paramContext);
    zzES.setBackgroundColor(-16777216);
    zzfG();
    zzEO = new zzu(this);
    zzEO.zzfQ();
    if (zzEP != null) {
      zzEP.zza(this);
    }
    if (zzEP == null) {
      zzg("AdVideoUnderlay Error", "Allocating player failed.");
    }
  }
  
  private void zza(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    int j = paramVarArgs.length;
    int i = 0;
    paramString = null;
    if (i < j)
    {
      String str = paramVarArgs[i];
      if (paramString == null) {}
      for (paramString = str;; paramString = null)
      {
        i += 1;
        break;
        localHashMap.put(paramString, str);
      }
    }
    zzpD.zza("onVideoEvent", localHashMap);
  }
  
  private void zzfG()
  {
    if (!zzfI())
    {
      zzEN.addView(zzES, new FrameLayout.LayoutParams(-1, -1));
      zzEN.bringChildToFront(zzES);
    }
  }
  
  private void zzfH()
  {
    if (zzfI()) {
      zzEN.removeView(zzES);
    }
  }
  
  private boolean zzfI()
  {
    return zzES.getParent() != null;
  }
  
  private void zzfJ()
  {
    if (zzpD.zzhP() == null) {
      break label12;
    }
    label12:
    while (zzEQ) {
      return;
    }
    if ((zzpD.zzhP().getWindow().getAttributes().flags & 0x80) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzER = bool;
      if (zzER) {
        break;
      }
      zzpD.zzhP().getWindow().addFlags(128);
      zzEQ = true;
      return;
    }
  }
  
  private void zzfK()
  {
    if (zzpD.zzhP() == null) {}
    while ((!zzEQ) || (zzER)) {
      return;
    }
    zzpD.zzhP().getWindow().clearFlags(128);
    zzEQ = false;
  }
  
  public static void zzg(zzjp paramzzjp)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "no_video_view");
    paramzzjp.zza("onVideoEvent", localHashMap);
  }
  
  public void destroy()
  {
    zzEO.cancel();
    if (zzEP != null) {
      zzEP.stop();
    }
    zzfK();
  }
  
  public void onPaused()
  {
    zza("pause", new String[0]);
    zzfK();
  }
  
  public void pause()
  {
    if (zzEP == null) {
      return;
    }
    zzEP.pause();
  }
  
  public void play()
  {
    if (zzEP == null) {
      return;
    }
    zzEP.play();
  }
  
  public void seekTo(int paramInt)
  {
    if (zzEP == null) {
      return;
    }
    zzEP.seekTo(paramInt);
  }
  
  public void setMimeType(String paramString)
  {
    zzEV = paramString;
  }
  
  public void zza(float paramFloat)
  {
    if (zzEP == null) {
      return;
    }
    zzEP.zza(paramFloat);
  }
  
  public void zzap(String paramString)
  {
    zzzK = paramString;
  }
  
  public void zzd(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3 + 2, paramInt4 + 2);
    localLayoutParams.setMargins(paramInt1 - 1, paramInt2 - 1, 0, 0);
    zzEN.setLayoutParams(localLayoutParams);
    requestLayout();
  }
  
  public void zzd(MotionEvent paramMotionEvent)
  {
    if (zzEP == null) {
      return;
    }
    zzEP.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void zzfA()
  {
    zzfJ();
  }
  
  public void zzfB()
  {
    zza("ended", new String[0]);
    zzfK();
  }
  
  public void zzfC()
  {
    zzfG();
    zzEU = zzET;
  }
  
  public void zzfD()
  {
    if (zzEP == null) {
      return;
    }
    if (!TextUtils.isEmpty(zzzK))
    {
      zzEP.setMimeType(zzEV);
      zzEP.setVideoPath(zzzK);
      return;
    }
    zza("no_src", new String[0]);
  }
  
  public void zzfE()
  {
    if (zzEP == null) {
      return;
    }
    TextView localTextView = new TextView(zzEP.getContext());
    localTextView.setText("AdMob - " + zzEP.zzeZ());
    localTextView.setTextColor(-65536);
    localTextView.setBackgroundColor(65280);
    zzEN.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
    zzEN.bringChildToFront(localTextView);
  }
  
  void zzfF()
  {
    if (zzEP == null) {}
    long l;
    do
    {
      return;
      l = zzEP.getCurrentPosition();
    } while ((zzET == l) || (l <= 0L));
    zzfH();
    zza("timeupdate", new String[] { "time", String.valueOf((float)l / 1000.0F) });
    zzET = l;
  }
  
  public void zzff()
  {
    if (zzEP == null) {
      return;
    }
    zzEP.zzff();
  }
  
  public void zzfg()
  {
    if (zzEP == null) {
      return;
    }
    zzEP.zzfg();
  }
  
  public void zzfy() {}
  
  public void zzfz()
  {
    if (zzEP == null) {}
    while (zzEU != 0L) {
      return;
    }
    zza("canplaythrough", new String[] { "duration", String.valueOf(zzEP.getDuration() / 1000.0F), "videoWidth", String.valueOf(zzEP.getVideoWidth()), "videoHeight", String.valueOf(zzEP.getVideoHeight()) });
  }
  
  public void zzg(String paramString1, String paramString2)
  {
    zza("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */