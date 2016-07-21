package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.zzf;
import java.util.Iterator;
import java.util.List;

public class zzc
  implements zzf
{
  public String zza(zzb paramzzb, Object paramObject)
  {
    return String.format("contains(%s,%s)", new Object[] { paramzzb.getName(), paramObject });
  }
  
  public String zza(Operator paramOperator, MetadataField paramMetadataField, Object paramObject)
  {
    return String.format("cmp(%s,%s,%s)", new Object[] { paramOperator.getTag(), paramMetadataField.getName(), paramObject });
  }
  
  public String zza(Operator paramOperator, List paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramOperator.getTag() + "(");
    paramList = paramList.iterator();
    for (paramOperator = ""; paramList.hasNext(); paramOperator = ",")
    {
      String str = (String)paramList.next();
      localStringBuilder.append(paramOperator);
      localStringBuilder.append(str);
    }
    return ")";
  }
  
  public String zzd(MetadataField paramMetadataField)
  {
    return String.format("fieldOnly(%s)", new Object[] { paramMetadataField.getName() });
  }
  
  public String zzd(MetadataField paramMetadataField, Object paramObject)
  {
    return String.format("has(%s,%s)", new Object[] { paramMetadataField.getName(), paramObject });
  }
  
  public String zzdh(String paramString)
  {
    return String.format("not(%s)", new Object[] { paramString });
  }
  
  public String zzdi(String paramString)
  {
    return String.format("fullTextSearch(%s)", new Object[] { paramString });
  }
  
  public String zztN()
  {
    return "all()";
  }
  
  public String zztO()
  {
    return "ownedByMe()";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */