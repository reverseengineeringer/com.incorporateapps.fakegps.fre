package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  private float mAlpha = 1.0F;
  private final int mVersionCode;
  private LatLng zzaSF;
  private BitmapDescriptor zzaTA;
  private boolean zzaTB;
  private boolean zzaTC = false;
  private float zzaTD = 0.0F;
  private float zzaTE = 0.5F;
  private float zzaTF = 0.0F;
  private boolean zzaTi = true;
  private float zzaTp = 0.5F;
  private float zzaTq = 1.0F;
  private String zzaTz;
  private String zzapg;
  
  public MarkerOptions()
  {
    mVersionCode = 1;
  }
  
  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    mVersionCode = paramInt;
    zzaSF = paramLatLng;
    zzapg = paramString1;
    zzaTz = paramString2;
    if (paramIBinder == null) {}
    for (paramLatLng = null;; paramLatLng = new BitmapDescriptor(zzd.zza.zzbs(paramIBinder)))
    {
      zzaTA = paramLatLng;
      zzaTp = paramFloat1;
      zzaTq = paramFloat2;
      zzaTB = paramBoolean1;
      zzaTi = paramBoolean2;
      zzaTC = paramBoolean3;
      zzaTD = paramFloat3;
      zzaTE = paramFloat4;
      zzaTF = paramFloat5;
      mAlpha = paramFloat6;
      return;
    }
  }
  
  public final MarkerOptions alpha(float paramFloat)
  {
    mAlpha = paramFloat;
    return this;
  }
  
  public final MarkerOptions anchor(float paramFloat1, float paramFloat2)
  {
    zzaTp = paramFloat1;
    zzaTq = paramFloat2;
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final MarkerOptions draggable(boolean paramBoolean)
  {
    zzaTB = paramBoolean;
    return this;
  }
  
  public final MarkerOptions flat(boolean paramBoolean)
  {
    zzaTC = paramBoolean;
    return this;
  }
  
  public final float getAlpha()
  {
    return mAlpha;
  }
  
  public final float getAnchorU()
  {
    return zzaTp;
  }
  
  public final float getAnchorV()
  {
    return zzaTq;
  }
  
  public final BitmapDescriptor getIcon()
  {
    return zzaTA;
  }
  
  public final float getInfoWindowAnchorU()
  {
    return zzaTE;
  }
  
  public final float getInfoWindowAnchorV()
  {
    return zzaTF;
  }
  
  public final LatLng getPosition()
  {
    return zzaSF;
  }
  
  public final float getRotation()
  {
    return zzaTD;
  }
  
  public final String getSnippet()
  {
    return zzaTz;
  }
  
  public final String getTitle()
  {
    return zzapg;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final MarkerOptions icon(BitmapDescriptor paramBitmapDescriptor)
  {
    zzaTA = paramBitmapDescriptor;
    return this;
  }
  
  public final MarkerOptions infoWindowAnchor(float paramFloat1, float paramFloat2)
  {
    zzaTE = paramFloat1;
    zzaTF = paramFloat2;
    return this;
  }
  
  public final boolean isDraggable()
  {
    return zzaTB;
  }
  
  public final boolean isFlat()
  {
    return zzaTC;
  }
  
  public final boolean isVisible()
  {
    return zzaTi;
  }
  
  public final MarkerOptions position(LatLng paramLatLng)
  {
    zzaSF = paramLatLng;
    return this;
  }
  
  public final MarkerOptions rotation(float paramFloat)
  {
    zzaTD = paramFloat;
    return this;
  }
  
  public final MarkerOptions snippet(String paramString)
  {
    zzaTz = paramString;
    return this;
  }
  
  public final MarkerOptions title(String paramString)
  {
    zzapg = paramString;
    return this;
  }
  
  public final MarkerOptions visible(boolean paramBoolean)
  {
    zzaTi = paramBoolean;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzAk()
  {
    if (zzaTA == null) {
      return null;
    }
    return zzaTA.zzzH().asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */