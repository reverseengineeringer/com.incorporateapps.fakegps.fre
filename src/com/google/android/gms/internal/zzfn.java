package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;
import java.util.Set;

public class zzfn
  extends zzfs
{
  static final Set zzDa = zzmr.zzc(new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" });
  private AdSizeParcel zzCh;
  private String zzDb = "top-right";
  private boolean zzDc = true;
  private int zzDd = 0;
  private int zzDe = 0;
  private int zzDf = 0;
  private int zzDg = 0;
  private final Activity zzDh;
  private ImageView zzDi;
  private LinearLayout zzDj;
  private zzft zzDk;
  private PopupWindow zzDl;
  private RelativeLayout zzDm;
  private ViewGroup zzDn;
  private int zzoG = -1;
  private int zzoH = -1;
  private final zzjp zzpD;
  private final Object zzpV = new Object();
  
  public zzfn(zzjp paramzzjp, zzft paramzzft)
  {
    super(paramzzjp, "resize");
    zzpD = paramzzjp;
    zzDh = paramzzjp.zzhP();
    zzDk = paramzzft;
  }
  
  private int[] zzeM()
  {
    if (!zzeO()) {
      return null;
    }
    if (zzDc) {
      return new int[] { zzDd + zzDf, zzDe + zzDg };
    }
    int[] arrayOfInt1 = zzr.zzbC().zzf(zzDh);
    int[] arrayOfInt2 = zzr.zzbC().zzh(zzDh);
    int m = arrayOfInt1[0];
    int j = zzDd + zzDf;
    int k = zzDe + zzDg;
    int i;
    if (j < 0)
    {
      i = 0;
      if (k >= arrayOfInt2[0]) {
        break label149;
      }
      j = arrayOfInt2[0];
    }
    for (;;)
    {
      return new int[] { i, j };
      i = j;
      if (zzoG + j <= m) {
        break;
      }
      i = m - zzoG;
      break;
      label149:
      j = k;
      if (zzoH + k > arrayOfInt2[1]) {
        j = arrayOfInt2[1] - zzoH;
      }
    }
  }
  
  private void zzh(Map paramMap)
  {
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("width"))) {
      zzoG = zzr.zzbC().zzaD((String)paramMap.get("width"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("height"))) {
      zzoH = zzr.zzbC().zzaD((String)paramMap.get("height"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX"))) {
      zzDf = zzr.zzbC().zzaD((String)paramMap.get("offsetX"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY"))) {
      zzDg = zzr.zzbC().zzaD((String)paramMap.get("offsetY"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen"))) {
      zzDc = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
    }
    paramMap = (String)paramMap.get("customClosePosition");
    if (!TextUtils.isEmpty(paramMap)) {
      zzDb = paramMap;
    }
  }
  
  public void zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      zzDd = paramInt1;
      zzDe = paramInt2;
      if ((zzDl != null) && (paramBoolean))
      {
        int[] arrayOfInt = zzeM();
        if (arrayOfInt != null)
        {
          zzDl.update(zzn.zzcS().zzb(zzDh, arrayOfInt[0]), zzn.zzcS().zzb(zzDh, arrayOfInt[1]), zzDl.getWidth(), zzDl.getHeight());
          zzd(arrayOfInt[0], arrayOfInt[1]);
        }
      }
      else
      {
        return;
      }
      zzp(true);
    }
  }
  
  void zzc(int paramInt1, int paramInt2)
  {
    if (zzDk != null) {
      zzDk.zza(paramInt1, paramInt2, zzoG, zzoH);
    }
  }
  
  void zzd(int paramInt1, int paramInt2)
  {
    zzb(paramInt1, paramInt2 - zzr.zzbC().zzh(zzDh)[0], zzoG, zzoH);
  }
  
  public void zze(int paramInt1, int paramInt2)
  {
    zzDd = paramInt1;
    zzDe = paramInt2;
  }
  
  boolean zzeL()
  {
    return (zzoG >= 0) && (zzoH >= 0);
  }
  
  public boolean zzeN()
  {
    synchronized (zzpV)
    {
      if (zzDl != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  boolean zzeO()
  {
    Object localObject = zzr.zzbC().zzf(zzDh);
    int[] arrayOfInt = zzr.zzbC().zzh(zzDh);
    int k = localObject[0];
    int i = localObject[1];
    if ((zzoG < 50) || (zzoG > k))
    {
      zzin.zzaK("Width is too small or too large.");
      return false;
    }
    if ((zzoH < 50) || (zzoH > i))
    {
      zzin.zzaK("Height is too small or too large.");
      return false;
    }
    if ((zzoH == i) && (zzoG == k))
    {
      zzin.zzaK("Cannot resize to a full-screen ad.");
      return false;
    }
    label184:
    int j;
    if (zzDc)
    {
      localObject = zzDb;
      i = -1;
      switch (((String)localObject).hashCode())
      {
      default: 
        switch (i)
        {
        default: 
          j = zzDd + zzDf + zzoG - 50;
          i = zzDe + zzDg;
        }
        break;
      }
    }
    while ((j >= 0) && (j + 50 <= k) && (i >= arrayOfInt[0]) && (i + 50 <= arrayOfInt[1]))
    {
      return true;
      if (!((String)localObject).equals("top-left")) {
        break label184;
      }
      i = 0;
      break label184;
      if (!((String)localObject).equals("top-center")) {
        break label184;
      }
      i = 1;
      break label184;
      if (!((String)localObject).equals("center")) {
        break label184;
      }
      i = 2;
      break label184;
      if (!((String)localObject).equals("bottom-left")) {
        break label184;
      }
      i = 3;
      break label184;
      if (!((String)localObject).equals("bottom-center")) {
        break label184;
      }
      i = 4;
      break label184;
      if (!((String)localObject).equals("bottom-right")) {
        break label184;
      }
      i = 5;
      break label184;
      i = zzDd;
      j = zzDf + i;
      i = zzDe + zzDg;
      continue;
      j = zzDd + zzDf + zzoG / 2 - 25;
      i = zzDe + zzDg;
      continue;
      j = zzDd + zzDf + zzoG / 2 - 25;
      i = zzDe + zzDg + zzoH / 2 - 25;
      continue;
      i = zzDd;
      j = zzDf + i;
      i = zzDe + zzDg + zzoH - 50;
      continue;
      j = zzDd + zzDf + zzoG / 2 - 25;
      i = zzDe + zzDg + zzoH - 50;
      continue;
      j = zzDd + zzDf + zzoG - 50;
      i = zzDe + zzDg + zzoH - 50;
    }
  }
  
  public void zzi(Map paramMap)
  {
    synchronized (zzpV)
    {
      if (zzDh == null)
      {
        zzam("Not an activity context. Cannot resize.");
        return;
      }
      if (zzpD.zzaN() == null)
      {
        zzam("Webview is not yet available, size is not set.");
        return;
      }
    }
    if (zzpD.zzaN().zzui)
    {
      zzam("Is interstitial. Cannot resize an interstitial.");
      return;
    }
    if (zzpD.zzhY())
    {
      zzam("Cannot resize an expanded banner.");
      return;
    }
    zzh(paramMap);
    if (!zzeL())
    {
      zzam("Invalid width and height options. Cannot resize.");
      return;
    }
    paramMap = zzDh.getWindow();
    if ((paramMap == null) || (paramMap.getDecorView() == null))
    {
      zzam("Activity context is not ready, cannot get window or decor view.");
      return;
    }
    int[] arrayOfInt = zzeM();
    if (arrayOfInt == null)
    {
      zzam("Resize location out of screen or close button is not visible.");
      return;
    }
    int i = zzn.zzcS().zzb(zzDh, zzoG);
    int j = zzn.zzcS().zzb(zzDh, zzoH);
    Object localObject2 = zzpD.getView().getParent();
    if ((localObject2 != null) && ((localObject2 instanceof ViewGroup)))
    {
      ((ViewGroup)localObject2).removeView(zzpD.getView());
      if (zzDl == null)
      {
        zzDn = ((ViewGroup)localObject2);
        localObject2 = zzr.zzbC().zzk(zzpD.getView());
        zzDi = new ImageView(zzDh);
        zzDi.setImageBitmap((Bitmap)localObject2);
        zzCh = zzpD.zzaN();
        zzDn.addView(zzDi);
        zzDm = new RelativeLayout(zzDh);
        zzDm.setBackgroundColor(0);
        zzDm.setLayoutParams(new ViewGroup.LayoutParams(i, j));
        zzDl = zzr.zzbC().zza(zzDm, i, j, false);
        zzDl.setOutsideTouchable(true);
        zzDl.setTouchable(true);
        localObject2 = zzDl;
        if (zzDc) {
          break label1067;
        }
      }
    }
    label1020:
    label1024:
    label1026:
    label1067:
    for (boolean bool = true;; bool = false)
    {
      ((PopupWindow)localObject2).setClippingEnabled(bool);
      zzDm.addView(zzpD.getView(), -1, -1);
      zzDj = new LinearLayout(zzDh);
      localObject2 = new RelativeLayout.LayoutParams(zzn.zzcS().zzb(zzDh, 50), zzn.zzcS().zzb(zzDh, 50));
      String str = zzDb;
      switch (str.hashCode())
      {
      }
      for (;;)
      {
        ((RelativeLayout.LayoutParams)localObject2).addRule(10);
        ((RelativeLayout.LayoutParams)localObject2).addRule(11);
        for (;;)
        {
          zzDj.setOnClickListener(new zzfn.1(this));
          zzDj.setContentDescription("Close button");
          zzDm.addView(zzDj, (ViewGroup.LayoutParams)localObject2);
          try
          {
            zzDl.showAtLocation(paramMap.getDecorView(), 0, zzn.zzcS().zzb(zzDh, arrayOfInt[0]), zzn.zzcS().zzb(zzDh, arrayOfInt[1]));
            zzc(arrayOfInt[0], arrayOfInt[1]);
            zzpD.zza(new AdSizeParcel(zzDh, new AdSize(zzoG, zzoH)));
            zzd(arrayOfInt[0], arrayOfInt[1]);
            zzao("resized");
            return;
          }
          catch (RuntimeException paramMap)
          {
            zzam("Cannot show popup window: " + paramMap.getMessage());
            zzDm.removeView(zzpD.getView());
            if (zzDn == null) {
              break label1020;
            }
            zzDn.removeView(zzDi);
            zzDn.addView(zzpD.getView());
            zzpD.zza(zzCh);
            return;
          }
          zzDl.dismiss();
          break;
          zzam("Webview is detached, probably in the middle of a resize or expand.");
          return;
          if (!str.equals("top-left")) {
            break label1024;
          }
          i = 0;
          break label1026;
          if (!str.equals("top-center")) {
            break label1024;
          }
          i = 1;
          break label1026;
          if (!str.equals("center")) {
            break label1024;
          }
          i = 2;
          break label1026;
          if (!str.equals("bottom-left")) {
            break label1024;
          }
          i = 3;
          break label1026;
          if (!str.equals("bottom-center")) {
            break label1024;
          }
          i = 4;
          break label1026;
          if (!str.equals("bottom-right")) {
            break label1024;
          }
          i = 5;
          break label1026;
          ((RelativeLayout.LayoutParams)localObject2).addRule(10);
          ((RelativeLayout.LayoutParams)localObject2).addRule(9);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(10);
          ((RelativeLayout.LayoutParams)localObject2).addRule(14);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(13);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(12);
          ((RelativeLayout.LayoutParams)localObject2).addRule(9);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(12);
          ((RelativeLayout.LayoutParams)localObject2).addRule(14);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(12);
          ((RelativeLayout.LayoutParams)localObject2).addRule(11);
        }
        i = -1;
        switch (i)
        {
        }
      }
    }
  }
  
  public void zzp(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      if (zzDl != null)
      {
        zzDl.dismiss();
        zzDm.removeView(zzpD.getView());
        if (zzDn != null)
        {
          zzDn.removeView(zzDi);
          zzDn.addView(zzpD.getView());
          zzpD.zza(zzCh);
        }
        if (paramBoolean)
        {
          zzao("default");
          if (zzDk != null) {
            zzDk.zzbf();
          }
        }
        zzDl = null;
        zzDm = null;
        zzDn = null;
        zzDj = null;
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */