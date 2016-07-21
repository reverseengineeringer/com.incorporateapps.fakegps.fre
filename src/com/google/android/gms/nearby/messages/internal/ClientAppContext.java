package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public final class ClientAppContext
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int versionCode;
  public final boolean zzbbH;
  public final String zzbco;
  public final String zzbcp;
  public final int zzbcq;
  
  ClientAppContext(int paramInt1, String paramString1, String paramString2, boolean paramBoolean, int paramInt2)
  {
    versionCode = paramInt1;
    zzbco = paramString1;
    zzbcp = paramString2;
    zzbbH = paramBoolean;
    zzbcq = paramInt2;
  }
  
  public ClientAppContext(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, false);
  }
  
  public ClientAppContext(String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramBoolean, 0);
  }
  
  public ClientAppContext(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    this(1, paramString1, paramString2, paramBoolean, paramInt);
  }
  
  private static boolean zzT(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return TextUtils.isEmpty(paramString2);
    }
    return paramString1.equals(paramString2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof ClientAppContext)) {
        return false;
      }
      paramObject = (ClientAppContext)paramObject;
    } while ((zzT(zzbco, zzbco)) && (zzT(zzbcp, zzbcp)) && (zzbbH == zzbbH) && (zzbcq == zzbcq));
    return false;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbco, zzbcp, Boolean.valueOf(zzbbH), Integer.valueOf(zzbcq) });
  }
  
  public final String toString()
  {
    return String.format("{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, callingContext: %d}", new Object[] { zzbco, zzbcp, Boolean.valueOf(zzbbH), Integer.valueOf(zzbcq) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.ClientAppContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */