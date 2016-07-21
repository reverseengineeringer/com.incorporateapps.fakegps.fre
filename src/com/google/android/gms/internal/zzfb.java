package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import java.util.List;

public abstract interface zzfb
  extends IInterface
{
  public abstract String getBody();
  
  public abstract String getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract String getHeadline();
  
  public abstract List getImages();
  
  public abstract boolean getOverrideClickHandling();
  
  public abstract boolean getOverrideImpressionRecording();
  
  public abstract String getPrice();
  
  public abstract double getStarRating();
  
  public abstract String getStore();
  
  public abstract void recordImpression();
  
  public abstract void zzc(zzd paramzzd);
  
  public abstract void zzd(zzd paramzzd);
  
  public abstract zzch zzdK();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */