package ResponsibilityChain;

import java.util.ArrayList;

public class ResponsibilityChain implements Filter {
    ArrayList<Filter> list = new ArrayList<Filter>();

    public void addFilter(Filter filter){
        list.add(filter);
    }


    @Override
    public void doFilter(Request request,ResponsibilityChain chain) {
//        记录运行到责任链的第几个节点了
        int index = 0;
        if(index >= list.size())
            return;
        Filter filter = list.get(index);
        index++;
        filter.doFilter(request,chain);
    }
}
