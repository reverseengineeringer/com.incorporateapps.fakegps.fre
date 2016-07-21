package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.List;

public class Credential
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
  private final String mName;
  final int mVersionCode;
  private final Uri zzVV;
  private final List zzVW;
  private final String zzVX;
  private final String zzVY;
  private final String zzVZ;
  private final String zzWa;
  private final String zzyv;
  
  Credential(int paramInt, String paramString1, String paramString2, Uri paramUri, List paramList, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    mVersionCode = paramInt;
    paramString1 = ((String)zzx.zzb(paramString1, "credential identifier cannot be null")).trim();
    zzx.zzh(paramString1, "credential identifier cannot be empty");
    zzyv = paramString1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2.trim())) {
        paramString1 = null;
      }
    }
    mName = paramString1;
    zzVV = paramUri;
    if (paramList == null) {}
    for (paramString1 = Collections.emptyList();; paramString1 = Collections.unmodifiableList(paramList))
    {
      zzVW = paramString1;
      zzVX = paramString3;
      if ((paramString3 == null) || (!paramString3.isEmpty())) {
        break;
      }
      throw new IllegalArgumentException("password cannot be empty");
    }
    if (!TextUtils.isEmpty(paramString4))
    {
      paramString1 = Uri.parse(paramString4).getScheme();
      if ((!"http".equalsIgnoreCase(paramString1)) && (!"https".equalsIgnoreCase(paramString1))) {
        break label208;
      }
    }
    label208:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zzVY = paramString4;
      zzVZ = paramString5;
      zzWa = paramString6;
      if ((TextUtils.isEmpty(zzVX)) || (TextUtils.isEmpty(zzVY))) {
        break;
      }
      throw new IllegalStateException("password and accountType cannot both be set");
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Credential)) {
        return false;
      }
      paramObject = (Credential)paramObject;
    } while ((TextUtils.equals(zzyv, zzyv)) && (TextUtils.equals(mName, mName)) && (zzw.equal(zzVV, zzVV)) && (TextUtils.equals(zzVX, zzVX)) && (TextUtils.equals(zzVY, zzVY)) && (TextUtils.equals(zzVZ, zzVZ)));
    return false;
  }
  
  public String getAccountType()
  {
    return zzVY;
  }
  
  public String getGeneratedPassword()
  {
    return zzVZ;
  }
  
  public String getId()
  {
    return zzyv;
  }
  
  public List getIdTokens()
  {
    return zzVW;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String getPassword()
  {
    return zzVX;
  }
  
  public Uri getProfilePictureUri()
  {
    return zzVV;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzyv, mName, zzVV, zzVX, zzVY, zzVZ });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public String zzmx()
  {
    return zzWa;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.Credential
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */