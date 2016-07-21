package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class SupportMapFragment
  extends Fragment
{
  private final SupportMapFragment.zzb zzaSP = new SupportMapFragment.zzb(this);
  private GoogleMap zzaSd;
  
  public static SupportMapFragment newInstance()
  {
    return new SupportMapFragment();
  }
  
  public static SupportMapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    SupportMapFragment localSupportMapFragment = new SupportMapFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localSupportMapFragment.setArguments(localBundle);
    return localSupportMapFragment;
  }
  
  public final GoogleMap getMap()
  {
    Object localObject = zzzV();
    if (localObject == null) {}
    for (;;)
    {
      return null;
      try
      {
        localObject = ((IMapFragmentDelegate)localObject).getMap();
        if (localObject == null) {
          continue;
        }
        if ((zzaSd == null) || (zzaSd.zzzJ().asBinder() != ((IGoogleMapDelegate)localObject).asBinder())) {
          zzaSd = new GoogleMap((IGoogleMapDelegate)localObject);
        }
        return zzaSd;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    zzx.zzcD("getMapAsync must be called on the main thread.");
    zzaSP.getMapAsync(paramOnMapReadyCallback);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    SupportMapFragment.zzb.zza(zzaSP, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    zzaSP.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = zzaSP.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramLayoutInflater.setClickable(true);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    zzaSP.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    zzaSP.onDestroyView();
    super.onDestroyView();
  }
  
  public final void onEnterAmbient(Bundle paramBundle)
  {
    zzx.zzcD("onEnterAmbient must be called on the main thread.");
    zzaSP.onEnterAmbient(paramBundle);
  }
  
  public final void onExitAmbient()
  {
    zzx.zzcD("onExitAmbient must be called on the main thread.");
    zzaSP.onExitAmbient();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    SupportMapFragment.zzb.zza(zzaSP, paramActivity);
    paramAttributeSet = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramAttributeSet);
    zzaSP.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    zzaSP.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    zzaSP.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    zzaSP.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.onSaveInstanceState(paramBundle);
    zzaSP.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  protected IMapFragmentDelegate zzzV()
  {
    zzaSP.zzzW();
    if (zzaSP.zztU() == null) {
      return null;
    }
    return ((SupportMapFragment.zza)zzaSP.zztU()).zzzV();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.SupportMapFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */