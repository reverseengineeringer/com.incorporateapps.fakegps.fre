package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzfh
  extends zzfc.zza
{
  private final NativeContentAdMapper zzCN;
  
  public zzfh(NativeContentAdMapper paramNativeContentAdMapper)
  {
    zzCN = paramNativeContentAdMapper;
  }
  
  public String getAdvertiser()
  {
    return zzCN.getAdvertiser();
  }
  
  public String getBody()
  {
    return zzCN.getBody();
  }
  
  public String getCallToAction()
  {
    return zzCN.getCallToAction();
  }
  
  public Bundle getExtras()
  {
    return zzCN.getExtras();
  }
  
  public String getHeadline()
  {
    return zzCN.getHeadline();
  }
  
  public List getImages()
  {
    Object localObject = zzCN.getImages();
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
    return zzCN.getOverrideClickHandling();
  }
  
  public boolean getOverrideImpressionRecording()
  {
    return zzCN.getOverrideImpressionRecording();
  }
  
  public void recordImpression()
  {
    zzCN.recordImpression();
  }
  
  public void zzc(zzd paramzzd)
  {
    zzCN.handleClick((View)zze.zzp(paramzzd));
  }
  
  public void zzd(zzd paramzzd)
  {
    zzCN.trackView((View)zze.zzp(paramzzd));
  }
  
  public zzch zzdO()
  {
    NativeAd.Image localImage = zzCN.getLogo();
    if (localImage != null) {
      return new zzc(localImage.getDrawable(), localImage.getUri(), localImage.getScale());
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */