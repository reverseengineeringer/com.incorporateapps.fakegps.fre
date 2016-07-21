package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzfg
  extends zzfb.zza
{
  private final NativeAppInstallAdMapper zzCM;
  
  public zzfg(NativeAppInstallAdMapper paramNativeAppInstallAdMapper)
  {
    zzCM = paramNativeAppInstallAdMapper;
  }
  
  public String getBody()
  {
    return zzCM.getBody();
  }
  
  public String getCallToAction()
  {
    return zzCM.getCallToAction();
  }
  
  public Bundle getExtras()
  {
    return zzCM.getExtras();
  }
  
  public String getHeadline()
  {
    return zzCM.getHeadline();
  }
  
  public List getImages()
  {
    Object localObject = zzCM.getImages();
    if (localObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        NativeAd.Image localImage = (NativeAd.Image)((Iterator)localObject).next();
        localArrayList.add(new zzc(localImage.getDrawable(), localImage.getUri(), localImage.getScale()));
      }
      return localArrayList;
    }
    return null;
  }
  
  public boolean getOverrideClickHandling()
  {
    return zzCM.getOverrideClickHandling();
  }
  
  public boolean getOverrideImpressionRecording()
  {
    return zzCM.getOverrideImpressionRecording();
  }
  
  public String getPrice()
  {
    return zzCM.getPrice();
  }
  
  public double getStarRating()
  {
    return zzCM.getStarRating();
  }
  
  public String getStore()
  {
    return zzCM.getStore();
  }
  
  public void recordImpression()
  {
    zzCM.recordImpression();
  }
  
  public void zzc(zzd paramzzd)
  {
    zzCM.handleClick((View)zze.zzp(paramzzd));
  }
  
  public void zzd(zzd paramzzd)
  {
    zzCM.trackView((View)zze.zzp(paramzzd));
  }
  
  public zzch zzdK()
  {
    NativeAd.Image localImage = zzCM.getIcon();
    if (localImage != null) {
      return new zzc(localImage.getDrawable(), localImage.getUri(), localImage.getScale());
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */