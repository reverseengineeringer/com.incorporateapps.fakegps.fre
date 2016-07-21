package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{
  private final IUiSettingsDelegate zzaST;
  
  UiSettings(IUiSettingsDelegate paramIUiSettingsDelegate)
  {
    zzaST = paramIUiSettingsDelegate;
  }
  
  public final boolean isCompassEnabled()
  {
    try
    {
      boolean bool = zzaST.isCompassEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isIndoorLevelPickerEnabled()
  {
    try
    {
      boolean bool = zzaST.isIndoorLevelPickerEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isMapToolbarEnabled()
  {
    try
    {
      boolean bool = zzaST.isMapToolbarEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isMyLocationButtonEnabled()
  {
    try
    {
      boolean bool = zzaST.isMyLocationButtonEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isRotateGesturesEnabled()
  {
    try
    {
      boolean bool = zzaST.isRotateGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isScrollGesturesEnabled()
  {
    try
    {
      boolean bool = zzaST.isScrollGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isTiltGesturesEnabled()
  {
    try
    {
      boolean bool = zzaST.isTiltGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isZoomControlsEnabled()
  {
    try
    {
      boolean bool = zzaST.isZoomControlsEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isZoomGesturesEnabled()
  {
    try
    {
      boolean bool = zzaST.isZoomGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setAllGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setAllGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setCompassEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setCompassEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setIndoorLevelPickerEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setIndoorLevelPickerEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setMapToolbarEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setMapToolbarEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setMyLocationButtonEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setMyLocationButtonEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setRotateGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setRotateGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setScrollGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setScrollGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setTiltGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setTiltGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setZoomControlsEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setZoomControlsEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setZoomGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      zzaST.setZoomGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.UiSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */