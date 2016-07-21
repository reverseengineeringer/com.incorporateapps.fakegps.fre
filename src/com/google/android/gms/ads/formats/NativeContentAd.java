package com.google.android.gms.ads.formats;

import android.os.Bundle;
import java.util.List;

public abstract class NativeContentAd
  extends NativeAd
{
  public abstract void destroy();
  
  public abstract CharSequence getAdvertiser();
  
  public abstract CharSequence getBody();
  
  public abstract CharSequence getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract CharSequence getHeadline();
  
  public abstract List getImages();
  
  public abstract NativeAd.Image getLogo();
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.formats.NativeContentAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */