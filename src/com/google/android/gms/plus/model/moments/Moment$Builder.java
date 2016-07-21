package com.google.android.gms.plus.model.moments;

import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.HashSet;
import java.util.Set;

public class Moment$Builder
{
  private String zzJN;
  private final Set zzbeN = new HashSet();
  private String zzbfA;
  private ItemScopeEntity zzbfI;
  private ItemScopeEntity zzbfJ;
  private String zzyv;
  
  public Moment build()
  {
    return new MomentEntity(zzbeN, zzyv, zzbfI, zzbfA, zzbfJ, zzJN);
  }
  
  public Builder setId(String paramString)
  {
    zzyv = paramString;
    zzbeN.add(Integer.valueOf(2));
    return this;
  }
  
  public Builder setResult(ItemScope paramItemScope)
  {
    zzbfI = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(4));
    return this;
  }
  
  public Builder setStartDate(String paramString)
  {
    zzbfA = paramString;
    zzbeN.add(Integer.valueOf(5));
    return this;
  }
  
  public Builder setTarget(ItemScope paramItemScope)
  {
    zzbfJ = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(6));
    return this;
  }
  
  public Builder setType(String paramString)
  {
    zzJN = paramString;
    zzbeN.add(Integer.valueOf(7));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.model.moments.Moment.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */