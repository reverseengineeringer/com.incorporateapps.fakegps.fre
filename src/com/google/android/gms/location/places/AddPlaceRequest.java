package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddPlaceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final String mName;
  final int mVersionCode;
  private final LatLng zzaPc;
  private final List zzaPd;
  private final String zzaPe;
  private final Uri zzaPf;
  private final String zzawc;
  
  AddPlaceRequest(int paramInt, String paramString1, LatLng paramLatLng, String paramString2, List paramList, String paramString3, Uri paramUri)
  {
    mVersionCode = paramInt;
    mName = zzx.zzcM(paramString1);
    zzaPc = ((LatLng)zzx.zzz(paramLatLng));
    zzawc = zzx.zzcM(paramString2);
    zzaPd = new ArrayList((Collection)zzx.zzz(paramList));
    if (!zzaPd.isEmpty()) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzx.zzb(bool1, "At least one place type should be provided.");
      if (TextUtils.isEmpty(paramString3))
      {
        bool1 = bool2;
        if (paramUri == null) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zzb(bool1, "One of phone number or URI should be provided.");
      zzaPe = paramString3;
      zzaPf = paramUri;
      return;
    }
  }
  
  public AddPlaceRequest(String paramString1, LatLng paramLatLng, String paramString2, List paramList, Uri paramUri)
  {
    this(paramString1, paramLatLng, paramString2, paramList, null, (Uri)zzx.zzz(paramUri));
  }
  
  public AddPlaceRequest(String paramString1, LatLng paramLatLng, String paramString2, List paramList, String paramString3)
  {
    this(paramString1, paramLatLng, paramString2, paramList, zzx.zzcM(paramString3), null);
  }
  
  public AddPlaceRequest(String paramString1, LatLng paramLatLng, String paramString2, List paramList, String paramString3, Uri paramUri)
  {
    this(0, paramString1, paramLatLng, paramString2, paramList, paramString3, paramUri);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress()
  {
    return zzawc;
  }
  
  public LatLng getLatLng()
  {
    return zzaPc;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String getPhoneNumber()
  {
    return zzaPe;
  }
  
  public List getPlaceTypes()
  {
    return zzaPd;
  }
  
  public Uri getWebsiteUri()
  {
    return zzaPf;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("name", mName).zzg("latLng", zzaPc).zzg("address", zzawc).zzg("placeTypes", zzaPd).zzg("phoneNumer", zzaPe).zzg("websiteUri", zzaPf).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.AddPlaceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */