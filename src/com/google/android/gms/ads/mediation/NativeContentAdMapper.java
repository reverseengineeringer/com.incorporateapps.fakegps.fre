package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeContentAdMapper
  extends NativeAdMapper
{
  private NativeAd.Image zzOp;
  private String zzxW;
  private List zzxX;
  private String zzxY;
  private String zzya;
  private String zzyh;
  
  public final String getAdvertiser()
  {
    return zzyh;
  }
  
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
  
  public final List getImages()
  {
    return zzxX;
  }
  
  public final NativeAd.Image getLogo()
  {
    return zzOp;
  }
  
  public final void setAdvertiser(String paramString)
  {
    zzyh = paramString;
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
  
  public final void setImages(List paramList)
  {
    zzxX = paramList;
  }
  
  public final void setLogo(NativeAd.Image paramImage)
  {
    zzOp = paramImage;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeContentAdMapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */