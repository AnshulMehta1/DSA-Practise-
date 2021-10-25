void preorderUtil(Node root , List<Integer> list)
    {
      if(root ==null)
        {
            return;
        }
        list.add(root.val);
        for(int i=0;i < root.children.size();i++)
        {
            preorderUtil(root.children.get(i), list);
        }  
    }
    public List<Integer> preorder(Node root) {
        
        List<Integer> list = new ArrayList<>();
    
        preorderUtil(root, list);
        return list;
    }
