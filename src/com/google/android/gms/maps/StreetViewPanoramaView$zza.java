package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class StreetViewPanoramaView$zza
  implements StreetViewLifecycleDelegate
{
  private final IStreetViewPanoramaViewDelegate zzaSL;
  private View zzaSM;
  private final ViewGroup zzaSk;
  
  public StreetViewPanoramaView$zza(ViewGroup paramViewGroup, IStreetViewPanoramaViewDelegate paramIStreetViewPanoramaViewDelegate)
  {
    zzaSL = ((IStreetViewPanoramaViewDelegate)zzx.zzz(paramIStreetViewPanoramaViewDelegate));
    zzaSk = ((ViewGroup)zzx.zzz(paramViewGroup));
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    try
    {
      zzaSL.getStreetViewPanoramaAsync(new StreetViewPanoramaView.zza.1(this, paramOnStreetViewPanoramaReadyCallback));
      return;
    }
    catch (RemoteException paramOnStreetViewPanoramaReadyCallback)
    {
      throw new RuntimeRemoteException(paramOnStreetViewPanoramaReadyCallback);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      zzaSL.onCreate(paramBundle);
      zzaSM = ((View)zze.zzp(zzaSL.getView()));
      zzaSk.removeAllViews();
      zzaSk.addView(zzaSM);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
  }
  
  public void onDestroy()
  {
    try
    {
      zzaSL.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onDestroyView()
  {
    throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
  }
  
  public void onLowMemory()
  {
    try
    {
      zzaSL.onLowMemory();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onPause()
  {
    try
    {
      zzaSL.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onResume()
  {
    try
    {
      zzaSL.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      zzaSL.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public void onStart() {}
  
  public void onStop() {}
  
  public IStreetViewPanoramaViewDelegate zzAd()
  {
    return zzaSL;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaView.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */