package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class DocumentSection
  implements SafeParcelable
{
  public static final zzd CREATOR = new zzd();
  public static final int zzTM = Integer.parseInt("-1");
  private static final RegisterSectionInfo zzTN = new RegisterSectionInfo.zza("SsbContext").zzM(true).zzbB("blob").zzmh();
  final int mVersionCode;
  public final String zzTO;
  final RegisterSectionInfo zzTP;
  public final int zzTQ;
  public final byte[] zzTR;
  
  DocumentSection(int paramInt1, String paramString, RegisterSectionInfo paramRegisterSectionInfo, int paramInt2, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == zzTM) || (zzh.zzao(paramInt2) != null)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid section type " + paramInt2);
      mVersionCode = paramInt1;
      zzTO = paramString;
      zzTP = paramRegisterSectionInfo;
      zzTQ = paramInt2;
      zzTR = paramArrayOfByte;
      paramString = zzmf();
      if (paramString == null) {
        break;
      }
      throw new IllegalArgumentException(paramString);
    }
  }
  
  public DocumentSection(String paramString, RegisterSectionInfo paramRegisterSectionInfo)
  {
    this(1, paramString, paramRegisterSectionInfo, zzTM, null);
  }
  
  public DocumentSection(String paramString1, RegisterSectionInfo paramRegisterSectionInfo, String paramString2)
  {
    this(1, paramString1, paramRegisterSectionInfo, zzh.zzbA(paramString2), null);
  }
  
  public DocumentSection(byte[] paramArrayOfByte, RegisterSectionInfo paramRegisterSectionInfo)
  {
    this(1, null, paramRegisterSectionInfo, zzTM, paramArrayOfByte);
  }
  
  public static DocumentSection zzh(byte[] paramArrayOfByte)
  {
    return new DocumentSection(paramArrayOfByte, zzTN);
  }
  
  public int describeContents()
  {
    zzd localzzd = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd localzzd = CREATOR;
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public String zzmf()
  {
    if ((zzTQ != zzTM) && (zzh.zzao(zzTQ) == null)) {
      return "Invalid section type " + zzTQ;
    }
    if ((zzTO != null) && (zzTR != null)) {
      return "Both content and blobContent set";
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.DocumentSection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */