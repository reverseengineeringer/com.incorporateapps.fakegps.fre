package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public class CommonWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private final int mVersionCode;
  String name;
  int state;
  String zzboQ;
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
  String zzio;
  
  CommonWalletObject()
  {
    mVersionCode = 1;
    zzboX = zzmn.zzsa();
    zzboZ = zzmn.zzsa();
    zzbpc = zzmn.zzsa();
    zzbpe = zzmn.zzsa();
    zzbpf = zzmn.zzsa();
    zzbpg = zzmn.zzsa();
  }
  
  CommonWalletObject(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt2, ArrayList paramArrayList1, TimeInterval paramTimeInterval, ArrayList paramArrayList2, String paramString9, String paramString10, ArrayList paramArrayList3, boolean paramBoolean, ArrayList paramArrayList4, ArrayList paramArrayList5, ArrayList paramArrayList6)
  {
    mVersionCode = paramInt1;
    zzio = paramString1;
    zzboW = paramString2;
    name = paramString3;
    zzboQ = paramString4;
    zzboS = paramString5;
    zzboT = paramString6;
    zzboU = paramString7;
    zzboV = paramString8;
    state = paramInt2;
    zzboX = paramArrayList1;
    zzboY = paramTimeInterval;
    zzboZ = paramArrayList2;
    zzbpa = paramString9;
    zzbpb = paramString10;
    zzbpc = paramArrayList3;
    zzbpd = paramBoolean;
    zzbpe = paramArrayList4;
    zzbpf = paramArrayList5;
    zzbpg = paramArrayList6;
  }
  
  public static CommonWalletObject.zza zzIr()
  {
    CommonWalletObject localCommonWalletObject = new CommonWalletObject();
    localCommonWalletObject.getClass();
    return new CommonWalletObject.zza(localCommonWalletObject, null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getId()
  {
    return zzio;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.CommonWalletObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */