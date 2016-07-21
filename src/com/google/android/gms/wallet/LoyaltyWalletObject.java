package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

public final class LoyaltyWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  private final int mVersionCode;
  int state;
  String zzaQZ;
  String zzboP;
  String zzboQ;
  String zzboR;
  String zzboS;
  String zzboT;
  String zzboU;
  String zzboV;
  String zzboW;
  ArrayList zzboX;
  TimeInterval zzboY;
  ArrayList zzboZ;
  String zzbpa;
  String zzbpb;
  ArrayList zzbpc;
  boolean zzbpd;
  ArrayList zzbpe;
  ArrayList zzbpf;
  ArrayList zzbpg;
  LoyaltyPoints zzbph;
  String zzio;
  
  LoyaltyWalletObject()
  {
    mVersionCode = 4;
    zzboX = zzmn.zzsa();
    zzboZ = zzmn.zzsa();
    zzbpc = zzmn.zzsa();
    zzbpe = zzmn.zzsa();
    zzbpf = zzmn.zzsa();
    zzbpg = zzmn.zzsa();
  }
  
  LoyaltyWalletObject(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, ArrayList paramArrayList1, TimeInterval paramTimeInterval, ArrayList paramArrayList2, String paramString11, String paramString12, ArrayList paramArrayList3, boolean paramBoolean, ArrayList paramArrayList4, ArrayList paramArrayList5, ArrayList paramArrayList6, LoyaltyPoints paramLoyaltyPoints)
  {
    mVersionCode = paramInt1;
    zzio = paramString1;
    zzboP = paramString2;
    zzboQ = paramString3;
    zzboR = paramString4;
    zzaQZ = paramString5;
    zzboS = paramString6;
    zzboT = paramString7;
    zzboU = paramString8;
    zzboV = paramString9;
    zzboW = paramString10;
    state = paramInt2;
    zzboX = paramArrayList1;
    zzboY = paramTimeInterval;
    zzboZ = paramArrayList2;
    zzbpa = paramString11;
    zzbpb = paramString12;
    zzbpc = paramArrayList3;
    zzbpd = paramBoolean;
    zzbpe = paramArrayList4;
    zzbpf = paramArrayList5;
    zzbpg = paramArrayList6;
    zzbph = paramLoyaltyPoints;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getAccountId()
  {
    return zzboP;
  }
  
  public final String getAccountName()
  {
    return zzaQZ;
  }
  
  public final String getBarcodeAlternateText()
  {
    return zzboS;
  }
  
  public final String getBarcodeType()
  {
    return zzboT;
  }
  
  public final String getBarcodeValue()
  {
    return zzboU;
  }
  
  public final String getId()
  {
    return zzio;
  }
  
  public final String getIssuerName()
  {
    return zzboQ;
  }
  
  public final String getProgramName()
  {
    return zzboR;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.LoyaltyWalletObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */