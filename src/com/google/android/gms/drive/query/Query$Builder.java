package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Query$Builder
{
  private Set zzapC;
  private boolean zzarL;
  private String zzatW;
  private SortOrder zzatX;
  private List zzatY;
  private boolean zzatZ;
  private final List zzaua = new ArrayList();
  
  public Query$Builder() {}
  
  public Query$Builder(Query paramQuery)
  {
    zzaua.add(paramQuery.getFilter());
    zzatW = paramQuery.getPageToken();
    zzatX = paramQuery.getSortOrder();
    zzatY = paramQuery.zztJ();
    zzatZ = paramQuery.zztK();
    zzapC = paramQuery.zztL();
    zzarL = paramQuery.zztM();
  }
  
  public Builder addFilter(Filter paramFilter)
  {
    if (!(paramFilter instanceof MatchAllFilter)) {
      zzaua.add(paramFilter);
    }
    return this;
  }
  
  public Query build()
  {
    return new Query(new LogicalFilter(Operator.zzauC, zzaua), zzatW, zzatX, zzatY, zzatZ, zzapC, zzarL, null);
  }
  
  public Builder setPageToken(String paramString)
  {
    zzatW = paramString;
    return this;
  }
  
  public Builder setSortOrder(SortOrder paramSortOrder)
  {
    zzatX = paramSortOrder;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.Query.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */