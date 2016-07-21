package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;

public abstract interface IMapViewDelegate
  extends IInterface
{
  public abstract IGoogleMapDelegate getMap();
  
  public abstract void getMapAsync(zzo paramzzo);
  
  public abstract zzd getView();
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onEnterAmbient(Bundle paramBundle);
  
  public abstract void onExitAmbient();
  
  public abstract void onLowMemory();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.IMapViewDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */