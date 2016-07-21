package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

public class FastJsonResponse$Field
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  private final int mVersionCode;
  protected final int zzamL;
  protected final boolean zzamM;
  protected final int zzamN;
  protected final boolean zzamO;
  protected final String zzamP;
  protected final int zzamQ;
  protected final Class zzamR;
  protected final String zzamS;
  private FieldMappingDictionary zzamT;
  private FastJsonResponse.zza zzamU;
  
  FastJsonResponse$Field(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, ConverterWrapper paramConverterWrapper)
  {
    mVersionCode = paramInt1;
    zzamL = paramInt2;
    zzamM = paramBoolean1;
    zzamN = paramInt3;
    zzamO = paramBoolean2;
    zzamP = paramString1;
    zzamQ = paramInt4;
    if (paramString2 == null) {
      zzamR = null;
    }
    for (zzamS = null; paramConverterWrapper == null; zzamS = paramString2)
    {
      zzamU = null;
      return;
      zzamR = SafeParcelResponse.class;
    }
    zzamU = paramConverterWrapper.zzrh();
  }
  
  protected FastJsonResponse$Field(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class paramClass, FastJsonResponse.zza paramzza)
  {
    mVersionCode = 1;
    zzamL = paramInt1;
    zzamM = paramBoolean1;
    zzamN = paramInt2;
    zzamO = paramBoolean2;
    zzamP = paramString;
    zzamQ = paramInt3;
    zzamR = paramClass;
    if (paramClass == null) {}
    for (zzamS = null;; zzamS = paramClass.getCanonicalName())
    {
      zzamU = paramzza;
      return;
    }
  }
  
  public static Field zza(String paramString, int paramInt, FastJsonResponse.zza paramzza, boolean paramBoolean)
  {
    return new Field(paramzza.zzrj(), paramBoolean, paramzza.zzrk(), false, paramString, paramInt, null, paramzza);
  }
  
  public static Field zza(String paramString, int paramInt, Class paramClass)
  {
    return new Field(11, false, 11, false, paramString, paramInt, paramClass, null);
  }
  
  public static Field zzb(String paramString, int paramInt, Class paramClass)
  {
    return new Field(11, true, 11, true, paramString, paramInt, paramClass, null);
  }
  
  public static Field zzi(String paramString, int paramInt)
  {
    return new Field(0, false, 0, false, paramString, paramInt, null, null);
  }
  
  public static Field zzj(String paramString, int paramInt)
  {
    return new Field(4, false, 4, false, paramString, paramInt, null, null);
  }
  
  public static Field zzk(String paramString, int paramInt)
  {
    return new Field(6, false, 6, false, paramString, paramInt, null, null);
  }
  
  public static Field zzl(String paramString, int paramInt)
  {
    return new Field(7, false, 7, false, paramString, paramInt, null, null);
  }
  
  public static Field zzm(String paramString, int paramInt)
  {
    return new Field(7, true, 7, true, paramString, paramInt, null, null);
  }
  
  public Object convertBack(Object paramObject)
  {
    return zzamU.convertBack(paramObject);
  }
  
  public int describeContents()
  {
    zza localzza = CREATOR;
    return 0;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("Field\n");
    localStringBuilder1.append("            versionCode=").append(mVersionCode).append('\n');
    localStringBuilder1.append("                 typeIn=").append(zzamL).append('\n');
    localStringBuilder1.append("            typeInArray=").append(zzamM).append('\n');
    localStringBuilder1.append("                typeOut=").append(zzamN).append('\n');
    localStringBuilder1.append("           typeOutArray=").append(zzamO).append('\n');
    localStringBuilder1.append("        outputFieldName=").append(zzamP).append('\n');
    localStringBuilder1.append("      safeParcelFieldId=").append(zzamQ).append('\n');
    localStringBuilder1.append("       concreteTypeName=").append(zzru()).append('\n');
    if (zzrt() != null) {
      localStringBuilder1.append("     concreteType.class=").append(zzrt().getCanonicalName()).append('\n');
    }
    StringBuilder localStringBuilder2 = localStringBuilder1.append("          converterName=");
    if (zzamU == null) {}
    for (String str = "null";; str = zzamU.getClass().getCanonicalName())
    {
      localStringBuilder2.append(str).append('\n');
      return localStringBuilder1.toString();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza localzza = CREATOR;
    zza.zza(this, paramParcel, paramInt);
  }
  
  public void zza(FieldMappingDictionary paramFieldMappingDictionary)
  {
    zzamT = paramFieldMappingDictionary;
  }
  
  public int zzrj()
  {
    return zzamL;
  }
  
  public int zzrk()
  {
    return zzamN;
  }
  
  public Field zzro()
  {
    return new Field(mVersionCode, zzamL, zzamM, zzamN, zzamO, zzamP, zzamQ, zzamS, zzrw());
  }
  
  public boolean zzrp()
  {
    return zzamM;
  }
  
  public boolean zzrq()
  {
    return zzamO;
  }
  
  public String zzrr()
  {
    return zzamP;
  }
  
  public int zzrs()
  {
    return zzamQ;
  }
  
  public Class zzrt()
  {
    return zzamR;
  }
  
  String zzru()
  {
    if (zzamS == null) {
      return null;
    }
    return zzamS;
  }
  
  public boolean zzrv()
  {
    return zzamU != null;
  }
  
  ConverterWrapper zzrw()
  {
    if (zzamU == null) {
      return null;
    }
    return ConverterWrapper.zza(zzamU);
  }
  
  public Map zzrx()
  {
    zzx.zzz(zzamS);
    zzx.zzz(zzamT);
    return zzamT.zzcR(zzamS);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.server.response.FastJsonResponse.Field
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */