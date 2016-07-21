package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmo;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznc;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class FastJsonResponse
{
  private void zza(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Object paramObject)
  {
    if (paramField.zzrj() == 11)
    {
      paramStringBuilder.append(((FastJsonResponse)paramField.zzrt().cast(paramObject)).toString());
      return;
    }
    if (paramField.zzrj() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(zznb.zzcU((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private void zza(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, ArrayList paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0) {
        paramStringBuilder.append(",");
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        zza(paramStringBuilder, paramField, localObject);
      }
      i += 1;
    }
    paramStringBuilder.append("]");
  }
  
  public String toString()
  {
    Map localMap = zzrl();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localMap.get(str);
      if (zza(localField))
      {
        Object localObject = zza(localField, zzb(localField));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        }
        for (;;)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null) {
            break label139;
          }
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label139:
        switch (localField.zzrk())
        {
        default: 
          if (localField.zzrp()) {
            zza(localStringBuilder, localField, (ArrayList)localObject);
          }
          break;
        case 8: 
          localStringBuilder.append("\"").append(zzmo.zzj((byte[])localObject)).append("\"");
          break;
        case 9: 
          localStringBuilder.append("\"").append(zzmo.zzk((byte[])localObject)).append("\"");
          break;
        case 10: 
          zznc.zza(localStringBuilder, (HashMap)localObject);
          continue;
          zza(localStringBuilder, localField, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
  
  protected Object zza(FastJsonResponse.Field paramField, Object paramObject)
  {
    Object localObject = paramObject;
    if (FastJsonResponse.Field.zzc(paramField) != null) {
      localObject = paramField.convertBack(paramObject);
    }
    return localObject;
  }
  
  protected boolean zza(FastJsonResponse.Field paramField)
  {
    if (paramField.zzrk() == 11)
    {
      if (paramField.zzrq()) {
        return zzcQ(paramField.zzrr());
      }
      return zzcP(paramField.zzrr());
    }
    return zzcO(paramField.zzrr());
  }
  
  protected Object zzb(FastJsonResponse.Field paramField)
  {
    String str = paramField.zzrr();
    if (paramField.zzrt() != null)
    {
      boolean bool;
      if (zzcN(paramField.zzrr()) == null)
      {
        bool = true;
        zzx.zza(bool, "Concrete field shouldn't be value object: %s", new Object[] { paramField.zzrr() });
        if (!paramField.zzrq()) {
          break label71;
        }
      }
      label71:
      for (paramField = zzrn();; paramField = zzrm())
      {
        if (paramField == null) {
          break label79;
        }
        return paramField.get(str);
        bool = false;
        break;
      }
      try
      {
        label79:
        paramField = "get" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
        paramField = getClass().getMethod(paramField, new Class[0]).invoke(this, new Object[0]);
        return paramField;
      }
      catch (Exception paramField)
      {
        throw new RuntimeException(paramField);
      }
    }
    return zzcN(paramField.zzrr());
  }
  
  protected abstract Object zzcN(String paramString);
  
  protected abstract boolean zzcO(String paramString);
  
  protected boolean zzcP(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }
  
  protected boolean zzcQ(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }
  
  public abstract Map zzrl();
  
  public HashMap zzrm()
  {
    return null;
  }
  
  public HashMap zzrn()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.server.response.FastJsonResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */