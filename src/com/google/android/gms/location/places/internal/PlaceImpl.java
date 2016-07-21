package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceImpl
  implements SafeParcelable, Place
{
  public static final zzl CREATOR = new zzl();
  private final String mName;
  final int mVersionCode;
  private final LatLng zzaPc;
  private final List zzaPd;
  private final String zzaPe;
  private final Uri zzaPf;
  private final String zzaQA;
  private final boolean zzaQB;
  private final float zzaQC;
  private final int zzaQD;
  private final long zzaQE;
  private final List zzaQF;
  private final String zzaQG;
  private final List zzaQH;
  private final Map zzaQI;
  private final TimeZone zzaQJ;
  private Locale zzaQr;
  private final Bundle zzaQw;
  private final PlaceLocalization zzaQx;
  private final float zzaQy;
  private final LatLngBounds zzaQz;
  private final String zzawc;
  private final String zzyv;
  
  PlaceImpl(int paramInt1, String paramString1, List paramList1, List paramList2, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5, List paramList3, LatLng paramLatLng, float paramFloat1, LatLngBounds paramLatLngBounds, String paramString6, Uri paramUri, boolean paramBoolean, float paramFloat2, int paramInt2, long paramLong, PlaceLocalization paramPlaceLocalization)
  {
    mVersionCode = paramInt1;
    zzyv = paramString1;
    zzaPd = Collections.unmodifiableList(paramList1);
    zzaQF = paramList2;
    if (paramBundle != null)
    {
      zzaQw = paramBundle;
      mName = paramString2;
      zzawc = paramString3;
      zzaPe = paramString4;
      zzaQG = paramString5;
      if (paramList3 == null) {
        break label176;
      }
      label68:
      zzaQH = paramList3;
      zzaPc = paramLatLng;
      zzaQy = paramFloat1;
      zzaQz = paramLatLngBounds;
      if (paramString6 == null) {
        break label184;
      }
    }
    for (;;)
    {
      zzaQA = paramString6;
      zzaPf = paramUri;
      zzaQB = paramBoolean;
      zzaQC = paramFloat2;
      zzaQD = paramInt2;
      zzaQE = paramLong;
      zzaQI = Collections.unmodifiableMap(new HashMap());
      zzaQJ = null;
      zzaQr = null;
      zzaQx = paramPlaceLocalization;
      return;
      paramBundle = new Bundle();
      break;
      label176:
      paramList3 = Collections.emptyList();
      break label68;
      label184:
      paramString6 = "UTC";
    }
  }
  
  public final int describeContents()
  {
    zzl localzzl = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceImpl)) {
        return false;
      }
      paramObject = (PlaceImpl)paramObject;
    } while ((zzyv.equals(zzyv)) && (zzw.equal(zzaQr, zzaQr)) && (zzaQE == zzaQE));
    return false;
  }
  
  public final String getAddress()
  {
    return zzawc;
  }
  
  public final CharSequence getAttributions()
  {
    return zzc.zzj(zzaQH);
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final LatLng getLatLng()
  {
    return zzaPc;
  }
  
  public final Locale getLocale()
  {
    return zzaQr;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final String getPhoneNumber()
  {
    return zzaPe;
  }
  
  public final List getPlaceTypes()
  {
    return zzaPd;
  }
  
  public final int getPriceLevel()
  {
    return zzaQD;
  }
  
  public final float getRating()
  {
    return zzaQC;
  }
  
  public final LatLngBounds getViewport()
  {
    return zzaQz;
  }
  
  public final Uri getWebsiteUri()
  {
    return zzaPf;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzyv, zzaQr, Long.valueOf(zzaQE) });
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final void setLocale(Locale paramLocale)
  {
    zzaQr = paramLocale;
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("id", zzyv).zzg("placeTypes", zzaPd).zzg("locale", zzaQr).zzg("name", mName).zzg("address", zzawc).zzg("phoneNumber", zzaPe).zzg("latlng", zzaPc).zzg("viewport", zzaQz).zzg("websiteUri", zzaPf).zzg("isPermanentlyClosed", Boolean.valueOf(zzaQB)).zzg("priceLevel", Integer.valueOf(zzaQD)).zzg("timestampSecs", Long.valueOf(zzaQE)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl localzzl = CREATOR;
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public final List zzzn()
  {
    return zzaQF;
  }
  
  public final float zzzo()
  {
    return zzaQy;
  }
  
  public final String zzzp()
  {
    return zzaQG;
  }
  
  public final List zzzq()
  {
    return zzaQH;
  }
  
  public final boolean zzzr()
  {
    return zzaQB;
  }
  
  public final long zzzs()
  {
    return zzaQE;
  }
  
  public final Bundle zzzt()
  {
    return zzaQw;
  }
  
  public final String zzzu()
  {
    return zzaQA;
  }
  
  public final PlaceLocalization zzzv()
  {
    return zzaQx;
  }
  
  public final Place zzzw()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.PlaceImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */