package com.google.android.gms.maps.model;

public final class CameraPosition$Builder
{
  private LatLng zzaSX;
  private float zzaSY;
  private float zzaSZ;
  private float zzaTa;
  
  public CameraPosition$Builder() {}
  
  public CameraPosition$Builder(CameraPosition paramCameraPosition)
  {
    zzaSX = target;
    zzaSY = zoom;
    zzaSZ = tilt;
    zzaTa = bearing;
  }
  
  public final Builder bearing(float paramFloat)
  {
    zzaTa = paramFloat;
    return this;
  }
  
  public final CameraPosition build()
  {
    return new CameraPosition(zzaSX, zzaSY, zzaSZ, zzaTa);
  }
  
  public final Builder target(LatLng paramLatLng)
  {
    zzaSX = paramLatLng;
    return this;
  }
  
  public final Builder tilt(float paramFloat)
  {
    zzaSZ = paramFloat;
    return this;
  }
  
  public final Builder zoom(float paramFloat)
  {
    zzaSY = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */