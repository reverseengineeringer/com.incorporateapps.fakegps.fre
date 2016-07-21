package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zznv;
import com.google.android.gms.internal.zzoz;

public final class Device
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  public static final int TYPE_CHEST_STRAP = 4;
  public static final int TYPE_PHONE = 1;
  public static final int TYPE_SCALE = 5;
  public static final int TYPE_TABLET = 2;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_WATCH = 3;
  private final int mVersionCode;
  private final int zzabB;
  private final String zzadc;
  private final String zzawI;
  private final String zzawJ;
  private final String zzawK;
  private final int zzawL;
  
  Device(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzawI = ((String)zzx.zzz(paramString1));
    zzawJ = ((String)zzx.zzz(paramString2));
    zzadc = "";
    zzawK = ((String)zzx.zzz(paramString4));
    zzabB = paramInt2;
    zzawL = paramInt3;
  }
  
  public Device(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, "", paramString3, paramInt, 0);
  }
  
  public Device(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    this(1, paramString1, paramString2, "", paramString4, paramInt1, paramInt2);
  }
  
  public static Device getLocalDevice(Context paramContext)
  {
    int i = zznv.zzaG(paramContext);
    paramContext = zzaC(paramContext);
    return new Device(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, paramContext, i, 2);
  }
  
  private boolean zza(Device paramDevice)
  {
    return (zzw.equal(zzawI, zzawI)) && (zzw.equal(zzawJ, zzawJ)) && (zzw.equal(zzadc, zzadc)) && (zzw.equal(zzawK, zzawK)) && (zzabB == zzabB) && (zzawL == zzawL);
  }
  
  private static String zzaC(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
  
  private boolean zzus()
  {
    return zzur() == 1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof Device)) && (zza((Device)paramObject)));
  }
  
  public final String getManufacturer()
  {
    return zzawI;
  }
  
  public final String getModel()
  {
    return zzawJ;
  }
  
  final String getStreamIdentifier()
  {
    return String.format("%s:%s:%s", new Object[] { zzawI, zzawJ, zzawK });
  }
  
  public final int getType()
  {
    return zzabB;
  }
  
  public final String getUid()
  {
    return zzawK;
  }
  
  public final String getVersion()
  {
    return zzadc;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzawI, zzawJ, zzadc, zzawK, Integer.valueOf(zzabB) });
  }
  
  public final String toString()
  {
    return String.format("Device{%s:%s:%s:%s}", new Object[] { getStreamIdentifier(), zzadc, Integer.valueOf(zzabB), Integer.valueOf(zzawL) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public final int zzur()
  {
    return zzawL;
  }
  
  public final String zzut()
  {
    if (zzus()) {
      return zzawK;
    }
    return zzoz.zzdF(zzawK);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Device
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */