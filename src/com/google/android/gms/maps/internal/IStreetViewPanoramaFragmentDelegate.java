package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public abstract interface IStreetViewPanoramaFragmentDelegate
  extends IInterface
{
  public abstract IStreetViewPanoramaDelegate getStreetViewPanorama();
  
  public abstract void getStreetViewPanoramaAsync(zzaa paramzzaa);
  
  public abstract boolean isReady();
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract zzd onCreateView(zzd paramzzd1, zzd paramzzd2, Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onDestroyView();
  
  public abstract void onInflate(zzd paramzzd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions, Bundle paramBundle);
  
  public abstract void onLowMemory();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */