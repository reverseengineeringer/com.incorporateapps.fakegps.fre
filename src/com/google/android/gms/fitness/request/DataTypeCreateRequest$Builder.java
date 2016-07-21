package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;

public class DataTypeCreateRequest$Builder
{
  private String mName;
  private List zzawE = new ArrayList();
  
  public Builder addField(Field paramField)
  {
    if (!zzawE.contains(paramField)) {
      zzawE.add(paramField);
    }
    return this;
  }
  
  public Builder addField(String paramString, int paramInt)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid name specified");
      return addField(Field.zzn(paramString, paramInt));
    }
  }
  
  public DataTypeCreateRequest build()
  {
    boolean bool2 = true;
    if (mName != null)
    {
      bool1 = true;
      zzx.zza(bool1, "Must set the name");
      if (zzawE.isEmpty()) {
        break label52;
      }
    }
    label52:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Must specify the data fields");
      return new DataTypeCreateRequest(this, null);
      bool1 = false;
      break;
    }
  }
  
  public Builder setName(String paramString)
  {
    mName = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataTypeCreateRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */