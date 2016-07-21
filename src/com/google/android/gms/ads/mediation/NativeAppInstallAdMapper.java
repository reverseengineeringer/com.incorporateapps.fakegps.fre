package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeAppInstallAdMapper
  extends NativeAdMapper
{
  private NativeAd.Image zzOo;
  private String zzxW;
  private List zzxX;
  private String zzxY;
  private String zzya;
  private double zzyb;
  private String zzyc;
  private String zzyd;
  
  public final String getBody()
  {
    return zzxY;
  }
  
  public final String getCallToAction()
  {
    return zzya;
  }
  
  public final String getHeadline()
  {
    return zzxW;
  }
  
  public final NativeAd.Image getIcon()
  {
    return zzOo;
  }
  
  public final List getImages()
  {
    return zzxX;
  }
  
  public final String getPrice()
  {
    return zzyd;
  }
  
  public final double getStarRating()
  {
    return zzyb;
  }
  
  public final String getStore()
  {
    return zzyc;
  }
  
  public final void setBody(String paramString)
  {
    zzxY = paramString;
  }
  
  public final void setCallToAction(String paramString)
  {
    zzya = paramString;
  }
  
  public final void setHeadline(String paramString)
  {
    zzxW = paramString;
  }
  
  public final void setIcon(NativeAd.Image paramImage)
  {
    zzOo = paramImage;
  }
  
  public final void setImages(List paramList)
  {
    zzxX = paramList;
  }
  
  public final void setPrice(String paramString)
  {
    zzyd = paramString;
  }
  
  public final void setStarRating(double paramDouble)
  {
    zzyb = paramDouble;
  }
  
  public final void setStore(String paramString)
  {
    zzyc = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeAppInstallAdMapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */