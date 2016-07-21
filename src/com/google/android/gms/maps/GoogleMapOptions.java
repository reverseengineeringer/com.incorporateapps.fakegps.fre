package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  private final int mVersionCode;
  private Boolean zzaRP;
  private Boolean zzaRQ;
  private int zzaRR = -1;
  private CameraPosition zzaRS;
  private Boolean zzaRT;
  private Boolean zzaRU;
  private Boolean zzaRV;
  private Boolean zzaRW;
  private Boolean zzaRX;
  private Boolean zzaRY;
  private Boolean zzaRZ;
  private Boolean zzaSa;
  private Boolean zzaSb;
  
  public GoogleMapOptions()
  {
    mVersionCode = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10, byte paramByte11)
  {
    mVersionCode = paramInt1;
    zzaRP = com.google.android.gms.maps.internal.zza.zza(paramByte1);
    zzaRQ = com.google.android.gms.maps.internal.zza.zza(paramByte2);
    zzaRR = paramInt2;
    zzaRS = paramCameraPosition;
    zzaRT = com.google.android.gms.maps.internal.zza.zza(paramByte3);
    zzaRU = com.google.android.gms.maps.internal.zza.zza(paramByte4);
    zzaRV = com.google.android.gms.maps.internal.zza.zza(paramByte5);
    zzaRW = com.google.android.gms.maps.internal.zza.zza(paramByte6);
    zzaRX = com.google.android.gms.maps.internal.zza.zza(paramByte7);
    zzaRY = com.google.android.gms.maps.internal.zza.zza(paramByte8);
    zzaRZ = com.google.android.gms.maps.internal.zza.zza(paramByte9);
    zzaSa = com.google.android.gms.maps.internal.zza.zza(paramByte10);
    zzaSb = com.google.android.gms.maps.internal.zza.zza(paramByte11);
  }
  
  public static GoogleMapOptions createFromAttributes(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.MapAttrs);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(R.styleable.MapAttrs_mapType)) {
      localGoogleMapOptions.mapType(localTypedArray.getInt(R.styleable.MapAttrs_mapType, -1));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
      localGoogleMapOptions.zOrderOnTop(localTypedArray.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
      localGoogleMapOptions.useViewLifecycleInFragment(localTypedArray.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiCompass)) {
      localGoogleMapOptions.compassEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiCompass, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
      localGoogleMapOptions.rotateGesturesEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
      localGoogleMapOptions.scrollGesturesEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
      localGoogleMapOptions.tiltGesturesEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
      localGoogleMapOptions.zoomGesturesEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
      localGoogleMapOptions.zoomControlsEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_liteMode)) {
      localGoogleMapOptions.liteMode(localTypedArray.getBoolean(R.styleable.MapAttrs_liteMode, false));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
      localGoogleMapOptions.mapToolbarEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
    }
    if (localTypedArray.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
      localGoogleMapOptions.ambientEnabled(localTypedArray.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
    }
    localGoogleMapOptions.camera(CameraPosition.createFromAttributes(paramContext, paramAttributeSet));
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }
  
  public final GoogleMapOptions ambientEnabled(boolean paramBoolean)
  {
    zzaSb = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions camera(CameraPosition paramCameraPosition)
  {
    zzaRS = paramCameraPosition;
    return this;
  }
  
  public final GoogleMapOptions compassEnabled(boolean paramBoolean)
  {
    zzaRU = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Boolean getAmbientEnabled()
  {
    return zzaSb;
  }
  
  public final CameraPosition getCamera()
  {
    return zzaRS;
  }
  
  public final Boolean getCompassEnabled()
  {
    return zzaRU;
  }
  
  public final Boolean getLiteMode()
  {
    return zzaRZ;
  }
  
  public final Boolean getMapToolbarEnabled()
  {
    return zzaSa;
  }
  
  public final int getMapType()
  {
    return zzaRR;
  }
  
  public final Boolean getRotateGesturesEnabled()
  {
    return zzaRY;
  }
  
  public final Boolean getScrollGesturesEnabled()
  {
    return zzaRV;
  }
  
  public final Boolean getTiltGesturesEnabled()
  {
    return zzaRX;
  }
  
  public final Boolean getUseViewLifecycleInFragment()
  {
    return zzaRQ;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final Boolean getZOrderOnTop()
  {
    return zzaRP;
  }
  
  public final Boolean getZoomControlsEnabled()
  {
    return zzaRT;
  }
  
  public final Boolean getZoomGesturesEnabled()
  {
    return zzaRW;
  }
  
  public final GoogleMapOptions liteMode(boolean paramBoolean)
  {
    zzaRZ = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions mapToolbarEnabled(boolean paramBoolean)
  {
    zzaSa = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions mapType(int paramInt)
  {
    zzaRR = paramInt;
    return this;
  }
  
  public final GoogleMapOptions rotateGesturesEnabled(boolean paramBoolean)
  {
    zzaRY = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions scrollGesturesEnabled(boolean paramBoolean)
  {
    zzaRV = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions tiltGesturesEnabled(boolean paramBoolean)
  {
    zzaRX = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions useViewLifecycleInFragment(boolean paramBoolean)
  {
    zzaRQ = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final GoogleMapOptions zOrderOnTop(boolean paramBoolean)
  {
    zzaRP = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions zoomControlsEnabled(boolean paramBoolean)
  {
    zzaRT = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final GoogleMapOptions zoomGesturesEnabled(boolean paramBoolean)
  {
    zzaRW = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  final byte zzzK()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRP);
  }
  
  final byte zzzL()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRQ);
  }
  
  final byte zzzM()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRT);
  }
  
  final byte zzzN()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRU);
  }
  
  final byte zzzO()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRV);
  }
  
  final byte zzzP()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRW);
  }
  
  final byte zzzQ()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRX);
  }
  
  final byte zzzR()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRY);
  }
  
  final byte zzzS()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaRZ);
  }
  
  final byte zzzT()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaSa);
  }
  
  final byte zzzU()
  {
    return com.google.android.gms.maps.internal.zza.zze(zzaSb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */